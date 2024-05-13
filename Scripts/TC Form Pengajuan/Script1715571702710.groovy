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

TestData Hohendy = findTestData('Data Files/Param Pengajuan')

//Mobile.startExistingApplication('id.co.jmpmf.jmo3')

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++) 
	{
    if (Hohendy.getValue('Use', baris) == 'Yes') 
		{
		
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Spinner Nama Supplier'), 0)
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Pengajuan/Prod/AutoCompleteTextView'),Hohendy.getValue('Nama Supplier', baris), 0)
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Prod/Pilih 0'), 0)
			Mobile.hideKeyboard()
			Mobile.delay(1)
						
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Spinner Tipe Produk'), 0)
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Prod/Prod '+ Hohendy.getValue('Tipe Produk', baris)), 0, FailureHandling.OPTIONAL)
			Mobile.hideKeyboard()
			Mobile.delay(1)
			
			//if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 2W')
			if (Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 4W' || Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 2W')
			{
				Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Spinner Jaminan BPKB'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Bpkb/BPKB '+ Hohendy.getValue('BPKB Jaminan', baris)), 0, FailureHandling.OPTIONAL)
				Mobile.hideKeyboard()
				Mobile.delay(1)
			}
			
//			if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 4W')
//			{
//				Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Spinner Jaminan BPKB'), 0)
//				Mobile.delay(1)
//				Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Bpkb/BPKB '+ Hohendy.getValue('BPKB Jaminan', baris)), 0, FailureHandling.OPTIONAL)
//				Mobile.hideKeyboard()
//				Mobile.delay(1)
//			}
			
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Spinner Source of application'), 0)
			Mobile.delay(1)						
			Mobile.scrollToText(Hohendy.getValue('Source Application', baris), FailureHandling.OPTIONAL)
			Mobile.delay(1)			
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Source Order/Source '+ Hohendy.getValue('Source Application', baris)), 0, FailureHandling.OPTIONAL)
			Mobile.hideKeyboard()
			Mobile.delay(1)
			
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Spinner Jenis Asset'), 0)
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Pengajuan/Prod/AutoCompleteTextView'),Hohendy.getValue('Jenis Asset', baris), 0)
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Prod/Pilih 0'), 0)
			Mobile.hideKeyboard()
			Mobile.delay(1)
			
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Spinner tahun pembuatan'), 0)
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Tahun/Tahun '+ Hohendy.getValue('Tahun Pembuatan', baris)), 0, FailureHandling.OPTIONAL)
			Mobile.hideKeyboard()
			Mobile.delay(1)
			

			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/EditText Harga Kendaraan'), 0)
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Pengajuan/EditText Harga Kendaraan'),Hohendy.getValue('Harga Kendaraan', baris), 0)
			Mobile.hideKeyboard()
			
			if (Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 4W' || Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 2W')
			{
				Mobile.swipe(0, 600, 0, 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form Pengajuan/EditText - NTF Murni'), 0)
				Mobile.delay(1)
				Mobile.setText(findTestObject('Object Repository/Form Pengajuan/EditText - NTF Murni'),Hohendy.getValue('NTF MURNI', baris), 0)
				Mobile.hideKeyboard()
			}			
			if (Hohendy.getValue('Tipe Produk', baris) == 'New Bike' 
			|| Hohendy.getValue('Tipe Produk', baris) == 'New Car' 
			|| Hohendy.getValue('Tipe Produk', baris) == 'Used Bike'
			|| Hohendy.getValue('Tipe Produk', baris) == 'Used Car'
				)
			{
				Mobile.tap(findTestObject('Object Repository/Form Pengajuan/EditText - DP'), 0)
				Mobile.delay(1)
				Mobile.setText(findTestObject('Object Repository/Form Pengajuan/EditText - DP'),Hohendy.getValue('DP', baris), 0)
				Mobile.hideKeyboard()
			}			
			Mobile.swipe(0, 600, 0, 0)
			WebUI.delay(1)			
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/EditText - Tenor'), 0)
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Pengajuan/EditText - Tenor'),Hohendy.getValue('Tenor', baris), 0)
			Mobile.hideKeyboard()					
			Mobile.tap(findTestObject('Object Repository/Form Pengajuan/Button - Selanjutnya'), 0)							
    }
}

