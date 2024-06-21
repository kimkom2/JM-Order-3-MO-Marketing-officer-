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
import com.thoughtworks.selenium.webdriven.commands.GetValue as GetValue
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

TestData ParamDB = findTestData('Data Files/Param MO MAP')
TestData Hohendy = findTestData('Data Files/Param Pengajuan')
TestData Dataparampemohon = findTestData('Data Files/Param Pemohon')

//Mobile.startExistingApplication('id.co.jmpmf.jmo3')

Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Form MAP Marketing'), 0)
Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Search No Registrasi'), 0)
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Search No Registrasi'), ParamDB.getValue('NO_REGISTRASI', 1), 0)
Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Pilih No Registrasi'), 0)
Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi'), 0)
Mobile.delay(4)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
{
if (Hohendy.getValue('Use', baris) == 'Yes')
	{
	Mobile.delay(1)
	
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Spinner Tujuan Pembiayaan'), 0)	
	Mobile.delay(1)	
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Tujuan Pembiayaan/Tujuan '+ Hohendy.getValue('Tujuan Pembiayaan', baris)), 0, FailureHandling.OPTIONAL)
	Mobile.delay(2)
	
	if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 2W')
	{
		Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Loan Data/Spinner Loan'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Loan Data/Loan '+ Hohendy.getValue('Loan', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.delay(2)
	}
	
	if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 4W')
	{
		Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Loan Data/Spinner Loan'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Loan Data/Loan '+ Hohendy.getValue('Loan', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.delay(2)
	}
	
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Spinner Jenis Applikasi'), 0)
	Mobile.delay(1)
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/General'), 0)	
	Mobile.delay(1)
	
	while (true)
		{
			if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/Spinner Kecamatan'), 1, FailureHandling.OPTIONAL) == true) // step 1
			{
				Mobile.swipe(0, 600, 0, 0)
			}
			else
			{
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Spinner Product Offering'), 0)
				Mobile.delay(1)
				Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Product/android.widget.AutoCompleteTextView'), Hohendy.getValue('Product', baris), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Product/android.widget.TextView - Pilih'), 0)
				
//				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Spinner Product Offering'), 0)
//				Mobile.delay(2)
//				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Product/Prod '+ Hohendy.getValue('Product', baris)), 0, FailureHandling.OPTIONAL)
//				Mobile.delay(2)
				
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Application Priority/Spinner Application Prio'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Application Priority/Prio '+ Hohendy.getValue('Application Prio', baris)), 0, FailureHandling.OPTIONAL)
				Mobile.delay(1)
				
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/MAP Data Applikasi Menu/Spinner Customer Notification By'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Customer notification/By '+ Hohendy.getValue('Notifikasi', baris)), 0, FailureHandling.OPTIONAL)
				Mobile.delay(1)
				
				Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/EditText - Alamat Domisili'), Dataparampemohon.getValue('Alamat Pemohon', baris), 0)
				Mobile.hideKeyboard()
				Mobile.delay(1)
				
				Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/EditText - RT'), Dataparampemohon.getValue('RT Pemohon', baris), 0)
				Mobile.hideKeyboard()
				Mobile.delay(1)
				
				Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/EditText - RW'), Dataparampemohon.getValue('RW Pemohon', baris), 0)
				Mobile.hideKeyboard()
				Mobile.delay(1)
								
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/Spinner Kota'), 0)
				Mobile.delay(1)
				Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/AutoCompleteTextView'),Dataparampemohon.getValue('Kota pemohon', baris), 0)
				Mobile.delay(2)
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/Pilih 0'), 0)
				Mobile.hideKeyboard()
				Mobile.delay(1)
				
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/Spinner Kecamatan'), 0)
				Mobile.delay(1)
				Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/AutoCompleteTextView'),Dataparampemohon.getValue('Kecamatan pemohon', baris), 0)
				Mobile.delay(2)
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/Pilih 0'), 0)
				Mobile.hideKeyboard()
				Mobile.delay(1)
				
				break
			}
		}
		
		while (true)
			{
				if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/Button - SIMPAN'), 1, FailureHandling.OPTIONAL) == true) // step 1
				{
					Mobile.swipe(0, 600, 0, 0)
				}
				else
				{
					
				}
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/Spinner Kelurahan'), 0)
				Mobile.delay(1)
				Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/AutoCompleteTextView'),Dataparampemohon.getValue('Kelurahan pemohon', baris), 0)
				Mobile.delay(2)
				Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/Pilih 0'), 0)
				Mobile.hideKeyboard()
				Mobile.delay(1)
				
				Mobile.swipe(0, 600, 0, 0)
				
				Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/EditText - Nomor NPWP'), Dataparampemohon.getValue('No NPWP', baris), 0)
				Mobile.hideKeyboard()
				Mobile.delay(1)
				
				break
				}

		Mobile.swipe(0, 600, 0, 0)
		
		Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Tanggal Survey/EditText - Tanggal survey'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Tanggal Survey/Button - OKE'), 0)
		Mobile.delay(1)
		
		Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Alamat domisili/Button - SIMPAN'), 0)	
		
		Mobile.delay(4)
	}		
}

