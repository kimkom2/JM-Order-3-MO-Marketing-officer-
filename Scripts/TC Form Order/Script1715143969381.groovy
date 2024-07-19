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

Mobile.tap(findTestObject('Object Repository/Form Order/Form Order'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Order/Buat Pengajuan'), 0)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
	{
			if (Hohendy.getValue('Use', baris) == 'Yes')
			{	
				println('Masuk Applikasi Baru')
				
				Mobile.tap(findTestObject('Object Repository/Form Order/Input Applikasi Please Select'), 0)
				
				Mobile.delay(1)
				
				Mobile.tap(findTestObject('Object Repository/Form Order/Input Applikasi/Select '+ Hohendy.getValue('Select Applikasi', baris)), 0, FailureHandling.OPTIONAL)
				
				Mobile.delay(1)
				
					if (Hohendy.getValue('Select Applikasi', baris) == 'Cancel atau Input ulang')
					{
						Mobile.setText(findTestObject('Object Repository/Form Order/Text - No. Registrasi'), Hohendy.getValue('No_registrasi', baris), 0)
						
						Mobile.hideKeyboard()
							
						Mobile.delay(1)
							
						Mobile.tap(findTestObject('Object Repository/Form Order/Button Search'), 0)
						
					}
				
				Mobile.tap(findTestObject('Object Repository/Form Order/Button - Selanjutnya'), 0)					
				
			}
	}		

