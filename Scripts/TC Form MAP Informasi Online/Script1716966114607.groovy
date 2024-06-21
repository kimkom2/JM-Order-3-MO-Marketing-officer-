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

Mobile.delay(1)
Mobile.scrollToText('Informasi Online')
Mobile.tap(findTestObject('Object Repository/Informasi Online/Form Informasi Online'), 0)
Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Informasi Online/android.widget.CheckBox - Instagram'), 0)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
{
if (Hohendy.getValue('Use', baris) == 'Yes')
	{	
		
		
		Mobile.tap(findTestObject('Object Repository/Informasi Online/Spinner Tindak Pindana'), 0)
		Mobile.delay(1)
		Mobile.setText(findTestObject('Object Repository/Informasi Online/android.widget.AutoCompleteTextView'), Dataparampemohon.getValue('Tindak Pidana', baris), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Informasi Online/android.widget.TextView - Pilih'), 0)
		
		Mobile.tap(findTestObject('Object Repository/Informasi Online/android.widget.Button - SIMPAN'), 0)							
	}		
}

