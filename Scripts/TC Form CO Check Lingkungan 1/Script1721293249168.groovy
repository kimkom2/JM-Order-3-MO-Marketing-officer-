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

Mobile.delay(3)
Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Menu Check Lingkungan'), 0)
Mobile.delay(2)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
{
if (Hohendy.getValue('Use', baris) == 'Yes')
	{	
		Mobile.setText(findTestObject('Object Repository/Form Survey/Check Lingkungan/EditText - Nama Pemberi Informasi'), Hohendy.getValue('Nama Pemberi Informasi', baris), 0)
		Mobile.delay(1)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Hubungan Pemohon/Spinner Hubungan dengan Pemohon'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Hubungan Pemohon/HUB ' + Hohendy.getValue('Hub Dengan pemohon', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Spinner Benar Pemohon tinggal di alamat domisili'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Pemohon/Pemohon ' + Hohendy.getValue('Tinggal domisili', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Interaksi pemohon/Spinner Interaksi Debitur'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Interaksi pemohon/Interaksi ' + Hohendy.getValue('Interaksi Dengan konsumen', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Orang asing/Spinner Orang asing'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Orang asing/Asing ' + Hohendy.getValue('Interaksi dengan orang asing', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Ormas/Spinner Ormas'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Ormas/Ormas Tidak'), 0)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Negative/Spinner Negative'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Negative/Neg ' + Hohendy.getValue('Negative', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()		
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Negative', baris) != 'Tidak ada')
		{
			Mobile.setText(findTestObject('Object Repository/Form Survey/Check Lingkungan/EditText - Sumber Negative Information'), Hohendy.getValue('Informasi Negative', baris), 0)
			Mobile.delay(1)
			Mobile.hideKeyboard()
		}
		Mobile.swipe(0, 600, 0, 0)
									
		Mobile.tap(findTestObject('Object Repository/Form Survey/Check Lingkungan/Button - SIMPAN'), 0)							
	}		
}

