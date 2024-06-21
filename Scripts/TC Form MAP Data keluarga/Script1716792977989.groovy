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

Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/Data keluarga'), 0)
WebUI.delay(1)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
{
if (Hohendy.getValue('Use', baris) == 'Yes')
	{
		
	
	Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/EditText - Nama Keluarga'), Dataparampemohon.getValue('Nama Data Keluarga', baris), 0)
	Mobile.hideKeyboard()
	WebUI.delay(1)
	
	Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/EditText - NIK Keluarga'), Dataparampemohon.getValue('Nik Data Keluarga', baris), 0)
	Mobile.hideKeyboard()
	WebUI.delay(1)
	
	Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/EditText - Tempat Lahir Kelurga'), Dataparampemohon.getValue('Tempat lahir data Keluarga', baris), 0)
	Mobile.hideKeyboard()
	WebUI.delay(1)
	
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/EditText - Tanggal Lahir Keluarga'),0)
	WebUI.delay(1)
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/Button - OKE'),0)
	WebUI.delay(1)
	Mobile.hideKeyboard()
	
	Mobile.sendKeys(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/EditText - Tanggal Lahir Keluarga'), Dataparampemohon.getValue('Tanggal lahir data keluarga', baris), FailureHandling.STOP_ON_FAILURE)
    Mobile.hideKeyboard()
    WebUI.delay(1)
	
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/Spinner Jenis Kelamin Keluarga'),0)
	WebUI.delay(1)
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/Jenis ' + Dataparampemohon.getValue('Jenis Kelamin', baris)), 0, FailureHandling.OPTIONAL)
	WebUI.delay(1)
	
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/Spinner Hub'),0)
	WebUI.delay(1)
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/kel ' + Dataparampemohon.getValue('Hubungan Keluarga', baris)), 0, FailureHandling.OPTIONAL)
	WebUI.delay(1)
	
	Mobile.setText(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/EditText - Nama Ibu Kandung Keluarga'), Dataparampemohon.getValue('Nama Ibu kandung Data keluarga', baris), 0)
	Mobile.hideKeyboard()
	WebUI.delay(1)
	
	Mobile.tap(findTestObject('Object Repository/Form MAP marketing/Data Keluarga/Button - SIMPAN'),0)
	WebUI.delay(4)
							
	}		
}

