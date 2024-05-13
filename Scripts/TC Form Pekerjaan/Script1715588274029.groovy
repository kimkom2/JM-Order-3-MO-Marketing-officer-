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
			Mobile.tap(findTestObject('Object Repository/Form Pekerjaan/Jenis Pekerjaan/Spinner Jenis Pekerjaan'), 0)
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Pekerjaan/Jenis Pekerjaan/Pekerjaan '+ Hohendy.getValue('Jenis Pekerjaan', baris)), 0, FailureHandling.OPTIONAL)
			Mobile.hideKeyboard()
			Mobile.delay(1)
			
			Mobile.tap(findTestObject('Object Repository/Form Pekerjaan/Mulai Bekerja Bulan/Spinner Mulai Bekerjan Bulan'), 0)
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Pekerjaan/Mulai Bekerja Bulan/Bulan '+ Hohendy.getValue('Mulai Bekerja Bulan', baris)), 0, FailureHandling.OPTIONAL)
			Mobile.hideKeyboard()
			Mobile.delay(1)
			
			Mobile.tap(findTestObject('Object Repository/Form Pekerjaan/Mulai Bekerja Tahun/Spinner Mulai Bekerja Tahun'), 0)
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Pekerjaan/Mulai Bekerja Tahun/Tahun '+ Hohendy.getValue('Mulai Bekerja Tahun', baris)), 0, FailureHandling.OPTIONAL)
			Mobile.hideKeyboard()
			Mobile.delay(1)
									
			Mobile.tap(findTestObject('Object Repository/Form Pekerjaan/Button - Selanjutnya'), 0)			
			Mobile.delay(3)
			Mobile.tap(findTestObject('Object Repository/Form Disclaimer/Button - Sumbit Form'), 0)
			Mobile.delay(3)
			Mobile.tap(findTestObject('Object Repository/Form Disclaimer/Button - Submit'), 0)
			
    }
}

