import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

TestData Hohendy = findTestData('Data Files/Param Pemohon')

//Mobile.startExistingApplication('id.co.jmpmf.jmo3')

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++) 
	{
    if (Hohendy.getValue('Use', baris) == 'Yes') 
		{
        println('Masuk Foto')
        Mobile.tap(findTestObject('Object Repository/Form Pemohon/Button - BROWSE Photo'), 0)
        Mobile.delay(1)        				
        Mobile.tap(findTestObject('Object Repository/Form Pemohon/Capture photo from camera'), 0)
        Mobile.delay(3)        				
		Mobile.tapAtPosition(568, 2014, FailureHandling.OPTIONAL)
		Mobile.delay(5)        				
       	Mobile.tap(findTestObject('Object Repository/Form Pemohon/Button - OK Camera'), 0)
        Mobile.delay(2)
        Mobile.setText(findTestObject('Object Repository/Form Pemohon/Text - NIK'), Hohendy.getValue('NIK', baris), 0)
        Mobile.delay(1)
        Mobile.tapAtPosition(913, 1720, FailureHandling.STOP_ON_FAILURE)
        Mobile.delay(15)
        tampung = Mobile.getText(findTestObject('Object Repository/Form Pemohon/Text - Nama'), 0)
        println(tampung)
        WebUI.delay(1)

        // Start cek ro / non RO
        if (tampung.contains(Hohendy.getValue('Nama Konsumen', baris))) 
			{
            println('Start Masuk Logic RO')
            if (Hohendy.getValue('Status', baris) == 'Single') 
				{
                println('Start Masuk ke Logic Single')
                while (true) 
					{
	                    if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon/Button - Selanjutnya'), 1, FailureHandling.OPTIONAL) == true) // step 1
	                    {
	                        Mobile.swipe(0, 600, 0, 0)
	                    } 
						else 
						{	
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/Text - Jumlah Tanggungan'),Hohendy.getValue('Jumlah tanggunan', baris), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Status Rumah/Spinner Status kepemilikan Rumah'), 0)
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/AutoCompleteTextView Tahun'),Hohendy.getValue('Status Rumah', baris), 0)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
							Mobile.hideKeyboard()
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/Spinner Tahun Menempati'), 0)
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/AutoCompleteTextView Tahun'),Hohendy.getValue('Tahun Menempati', baris), 0)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Button - Selanjutnya'), 0)
							break
						}
					}  
				} 
				
				else 
				{
                println('Start Masuk ke Logic Menikah Part 1')
                while (true) 
					{
                    if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon Pasangan/Spinner Jenis Kelamin Pasangan'), 1, FailureHandling.OPTIONAL) == true) 
						{
							Mobile.swipe(0, 600, 0, 0)
						} 
						else 
						{
							println('Start Masuk ke Photo pasangan')
							println('End Masuk ke Logic Single') // step 1
							Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/BROWSE Foto Passangan'), 0)
							Mobile.delay(1)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/Capture photo from camera Pasangan'), 0)
							Mobile.delay(3)
							Mobile.tapAtPosition(568, 2014, FailureHandling.OPTIONAL)
							Mobile.delay(5)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/Button OK Pasangan'), 0)
							Mobile.delay(2)
							println('End Masuk ke Photo pasangan')
							
							Mobile.delay(2)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/Spinner WargaNegara'), 0)
							Mobile.delay(1)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/Warga ' + Hohendy.getValue('Warga Negara Pasangan', baris)), 0, FailureHandling.OPTIONAL)
							Mobile.delay(1)
							Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - NIK Pasangan'), Hohendy.getValue('NIK Pasangan', baris), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - Nama Pasangan'), Hohendy.getValue('Nama Pasangan', baris), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							break
						}
					}
				println('END Masuk ke Logic Menikah part 1')

                println('Start Masuk ke Logic Menikah part 2')

                while (true) 
					{
                    if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon Pasangan/Text - RT Pasangan'), 1, FailureHandling.OPTIONAL) == true) 
						{
							Mobile.swipe(0, 600, 0, 0)
						} 
					else 
						{
						Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - Tempat Lahir Pasangan'), Hohendy.getValue('Tempat Lahir pasangan', baris), 0)
                        Mobile.hideKeyboard()
                        Mobile.delay(1)
                        Mobile.sendKeys(findTestObject('Object Repository/Form Pemohon Pasangan/Text - Tanggal Lahir Pasangan'), Hohendy.getValue('Tgl Lahir Pasangan', baris), FailureHandling.STOP_ON_FAILURE)
                        Mobile.hideKeyboard()
                        Mobile.delay(1)
                        if (Hohendy.getValue('Alamat Sesuai Calon Debitur', baris) == 'Ya') 
						{
                            Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/CheckBox - Alamat KTP sama dengan calon debitur'),0)
                            Mobile.delay(2)
                        }
                        break
                    }
                }
                
                println('End Masuk ke Logic Menikah part 2')

                println('Start Masuk ke Logic Menikah part 3')
                while (true) 
					{
                    if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon/Button - Selanjutnya'), 1, FailureHandling.OPTIONAL) == true) {
                        Mobile.swipe(0, 600, 0, 0)
                    } 
					else 
					{

                        Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - No Handphone'), Hohendy.getValue('NO HP Pasangan', baris), 0)
                        Mobile.hideKeyboard()
                        Mobile.delay(1)
                        Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - Nama Ibu Kandung Pasangan'), Hohendy.getValue('Nama Ibu Kandung Pasangan', baris), 0)
                        Mobile.hideKeyboard()
                        Mobile.delay(1)
                        Mobile.setText(findTestObject('Object Repository/Form Pemohon/Text - Jumlah Tanggungan'), Hohendy.getValue('Jumlah tanggunan', baris), 0)
                        Mobile.hideKeyboard()
                        Mobile.delay(1)
                        Mobile.tap(findTestObject('Object Repository/Form Pemohon/Status Rumah/Spinner Status kepemilikan Rumah'), 0)
                        Mobile.setText(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/AutoCompleteTextView Tahun'), Hohendy.getValue('Status Rumah', baris), 0)
                        Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
                        Mobile.hideKeyboard()
                        Mobile.tap(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/Spinner Tahun Menempati'), 0)
                        Mobile.setText(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/AutoCompleteTextView Tahun'), Hohendy.getValue('Tahun Menempati', baris), 0)
                        Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)                       
                        break
                    }
                }
				
				//Mobile.scrollToText('Object Repository/Form Pemohon/Button - Selanjutnya', FailureHandling.OPTIONAL)				
				Mobile.swipe(0, 600, 0, 0)
				Mobile.delay(2)
				Mobile.tap(findTestObject('Object Repository/Form Pemohon/Button - Selanjutnya'), 0)
                println('End Masuk ke Logic Menikah part 3')
            }
            
        println('END Masuk Logic RO')
        } 
		
		else 
		{
			println('Start Masuk Logic NON RO')
			
			println('Start Masuk Logic NON RO Single')
			if (Hohendy.getValue('Status', baris) == 'Single')
				{
					
					Mobile.setText(findTestObject('Object Repository/Form Pemohon/Text - Nama'),Hohendy.getValue('Nama Konsumen', baris), 0)
					Mobile.hideKeyboard()
					Mobile.delay(1)
					Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - Tempat Lahir Pemohon'),Hohendy.getValue('Tempat Lahir Pemohon', baris), 0)
					Mobile.hideKeyboard()
					Mobile.delay(1)
					Mobile.sendKeys(findTestObject('Object Repository/Form Pemohon/EditText - Tanggal Lahir Pemohon'), Hohendy.getValue('Tgl Lahir Pemohon', baris), FailureHandling.STOP_ON_FAILURE)
					//Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - Tanggal Lahir Pemohon'),Hohendy.getValue('Tgl Lahir Pemohon', baris), 0)
					Mobile.hideKeyboard()
					Mobile.delay(1)
					
					while (true)
					{
						if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon/EditText - No Handphone Pemohon'), 1, FailureHandling.OPTIONAL) == true) // step 1
						{
							Mobile.swipe(0, 600, 0, 0)
						}
						else
						{
							println('Masuk swipe 1x')
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - RT Pemohon'),Hohendy.getValue('RT Pemohon', baris), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - RW Pemohon'),Hohendy.getValue('RW Pemohon', baris), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - Alamat Pemohon'),Hohendy.getValue('Alamat Pemohon', baris), 0)
							Mobile.hideKeyboard()
							WebUI.delay(1)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Spinner Kota Pemohon'), 0)
							Mobile.delay(1)
							Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/TextView Global Search'),Hohendy.getValue('Kota pemohon', baris), 0)
							Mobile.delay(2)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Spinner Kecamatan'), 0)
							Mobile.delay(1)
							Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/TextView Global Search'),Hohendy.getValue('Kecamatan pemohon', baris), 0)
							Mobile.delay(2)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Spinner Kelurahan'), 0)
							Mobile.delay(1)
							Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/TextView Global Search'),Hohendy.getValue('Kelurahan pemohon', baris), 0)
							Mobile.delay(2)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							
							break
						}
					}	
				
					while (true)
					{
						if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon/Button - Selanjutnya'), 1, FailureHandling.OPTIONAL) == true) // step 1
						{
							Mobile.swipe(0, 600, 0, 0)
						}
						else
						{
							println('Masuk swipe 2x')
							Mobile.sendKeys(findTestObject('Object Repository/Form Pemohon/EditText - No Handphone Pemohon'), Hohendy.getValue('No HP Pemohon', baris), FailureHandling.STOP_ON_FAILURE)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - Nama Ibu Kandung Pemohon'),Hohendy.getValue('Nama Ibu Kandung pemohon', baris), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/Text - Jumlah Tanggungan'),Hohendy.getValue('Jumlah tanggunan', baris), 0)
							Mobile.hideKeyboard()
							Mobile.delay(1)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Status Rumah/Spinner Status kepemilikan Rumah'), 0)
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/AutoCompleteTextView Tahun'),Hohendy.getValue('Status Rumah', baris), 0)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
							Mobile.hideKeyboard()
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/Spinner Tahun Menempati'), 0)
							Mobile.setText(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/AutoCompleteTextView Tahun'),Hohendy.getValue('Tahun Menempati', baris), 0)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
							Mobile.tap(findTestObject('Object Repository/Form Pemohon/Button - Selanjutnya'), 0)
							break
						}
					}	
				}
				println('End Masuk Logic NON RO Single')
				
				// ------------------//
				
				println('Start Masuk Logic NON RO Menikah')
				if (Hohendy.getValue('Status', baris) == 'Menikah')
					{
						
						Mobile.setText(findTestObject('Object Repository/Form Pemohon/Text - Nama'),Hohendy.getValue('Nama Konsumen', baris), 0)
						Mobile.hideKeyboard()
						Mobile.delay(1)
						Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - Tempat Lahir Pemohon'),Hohendy.getValue('Tempat Lahir Pemohon', baris), 0)
						Mobile.hideKeyboard()
						Mobile.delay(1)
						Mobile.sendKeys(findTestObject('Object Repository/Form Pemohon/EditText - Tanggal Lahir Pemohon'), Hohendy.getValue('Tgl Lahir Pemohon', baris), FailureHandling.STOP_ON_FAILURE)
						//Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - Tanggal Lahir Pemohon'),Hohendy.getValue('Tgl Lahir Pemohon', baris), 0)
						Mobile.hideKeyboard()
						Mobile.delay(1)
						
						while (true)
						{
							if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon/EditText - No Handphone Pemohon'), 1, FailureHandling.OPTIONAL) == true) // step 1
							{
								Mobile.swipe(0, 600, 0, 0)
							}
							else
							{
								println('Masuk swipe 3x')
								Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - RT Pemohon'),Hohendy.getValue('RT Pemohon', baris), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								
								Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - RW Pemohon'),Hohendy.getValue('RW Pemohon', baris), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								
								Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - Alamat Pemohon'),Hohendy.getValue('Alamat Pemohon', baris), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Spinner Kota Pemohon'), 0)
								Mobile.delay(1)
								Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/TextView Global Search'),Hohendy.getValue('Kota pemohon', baris), 0)
								Mobile.delay(2)
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Spinner Kecamatan'), 0)
								Mobile.delay(1)
								Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/TextView Global Search'),Hohendy.getValue('Kecamatan pemohon', baris), 0)
								Mobile.delay(2)
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Spinner Kelurahan'), 0)
								Mobile.delay(1)
								Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/TextView Global Search'),Hohendy.getValue('Kelurahan pemohon', baris), 0)
								Mobile.delay(2)
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								
								break
							}
						}
												
						println('Start Masuk ke Logic Menikah Part 1 NON RO')
						while (true)
							{
							if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon Pasangan/Spinner Jenis Kelamin Pasangan'), 1, FailureHandling.OPTIONAL) == true)
								{
									Mobile.swipe(0, 600, 0, 0)
								}
								else
								{
									println('Start Masuk ke Photo pasangan')
									println('End Masuk ke Logic Single') // step 1																		
									Mobile.sendKeys(findTestObject('Object Repository/Form Pemohon/EditText - No Handphone Pemohon'), Hohendy.getValue('No HP Pemohon', baris), FailureHandling.STOP_ON_FAILURE)
									Mobile.hideKeyboard()
									Mobile.delay(1)									
									Mobile.setText(findTestObject('Object Repository/Form Pemohon/EditText - Nama Ibu Kandung Pemohon'),Hohendy.getValue('Nama Ibu Kandung pemohon', baris), 0)
									Mobile.hideKeyboard()
									Mobile.delay(1)
																											
									Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/BROWSE Foto Passangan'), 0)
									Mobile.delay(1)
									Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/Capture photo from camera Pasangan'), 0)
									Mobile.delay(3)
									Mobile.tapAtPosition(568, 2014, FailureHandling.OPTIONAL)
									Mobile.delay(5)
									Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/Button OK Pasangan'), 0)
									Mobile.delay(2)
									println('End Masuk ke Photo pasangan')
									
									Mobile.delay(2)
									Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/Spinner WargaNegara'), 0)
									Mobile.delay(1)
									Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/Warga ' + Hohendy.getValue('Warga Negara Pasangan', baris)), 0, FailureHandling.OPTIONAL)
									Mobile.delay(1)
									Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - NIK Pasangan'), Hohendy.getValue('NIK Pasangan', baris), 0)
									Mobile.hideKeyboard()
									Mobile.delay(1)
									Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - Nama Pasangan'), Hohendy.getValue('Nama Pasangan', baris), 0)
									Mobile.hideKeyboard()
									Mobile.delay(1)
									break
								}
							}
						println('END Masuk ke Logic Menikah part 1 NON RO')
		
						println('Start Masuk ke Logic Menikah part 2 NON RO')
		
						while (true)
							{
							if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon Pasangan/Text - RT Pasangan'), 1, FailureHandling.OPTIONAL) == true)
								{
									Mobile.swipe(0, 600, 0, 0)
								}
							else
								{
								Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - Tempat Lahir Pasangan'), Hohendy.getValue('Tempat Lahir pasangan', baris), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								Mobile.sendKeys(findTestObject('Object Repository/Form Pemohon Pasangan/Text - Tanggal Lahir Pasangan'), Hohendy.getValue('Tgl Lahir Pasangan', baris), FailureHandling.STOP_ON_FAILURE)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								if (Hohendy.getValue('Alamat Sesuai Calon Debitur', baris) == 'Ya')
								{
									Mobile.tap(findTestObject('Object Repository/Form Pemohon Pasangan/CheckBox - Alamat KTP sama dengan calon debitur'),0)
									Mobile.delay(2)
								}
								break
							}
						}
						
						println('End Masuk ke Logic Menikah part 2 NON RO')
		
						println('Start Masuk ke Logic Menikah part 3 NON RO')
						while (true)
							{
							if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Pemohon/Button - Selanjutnya'), 1, FailureHandling.OPTIONAL) == true) {
								Mobile.swipe(0, 600, 0, 0)
							}
							else
							{
		
								Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - No Handphone'), Hohendy.getValue('NO HP Pasangan', baris), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								Mobile.setText(findTestObject('Object Repository/Form Pemohon Pasangan/Text - Nama Ibu Kandung Pasangan'), Hohendy.getValue('Nama Ibu Kandung Pasangan', baris), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								Mobile.setText(findTestObject('Object Repository/Form Pemohon/Text - Jumlah Tanggungan'), Hohendy.getValue('Jumlah tanggunan', baris), 0)
								Mobile.hideKeyboard()
								Mobile.delay(1)
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Status Rumah/Spinner Status kepemilikan Rumah'), 0)
								Mobile.setText(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/AutoCompleteTextView Tahun'), Hohendy.getValue('Status Rumah', baris), 0)
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
								Mobile.hideKeyboard()
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/Spinner Tahun Menempati'), 0)
								Mobile.setText(findTestObject('Object Repository/Form Pemohon/Tahun Menempati/AutoCompleteTextView Tahun'), Hohendy.getValue('Tahun Menempati', baris), 0)
								Mobile.tap(findTestObject('Object Repository/Form Pemohon/Pilih Index 0'), 0)
								break
							}
						}
						Mobile.swipe(0, 600, 0, 0)
						Mobile.delay(1)
						Mobile.tap(findTestObject('Object Repository/Form Pemohon/Button - Selanjutnya'), 0)
						println('End Masuk ke Logic Menikah part 3 NON RO')
					}
					println('End Masuk Logic NON RO Menikah')
				
			println('END Masuk Logic NON RO')
		}		
    }
}

