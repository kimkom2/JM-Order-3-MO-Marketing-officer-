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
Mobile.delay(2)
Mobile.tap(findTestObject('Object Repository/Form Emergency Data/Form Data Emergency Contct'), 0)
Mobile.delay(3)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
{
if (Hohendy.getValue('Use', baris) == 'Yes')
	{	
		
		Mobile.delay(1)
		Mobile.setText(findTestObject('Object Repository/Form Emergency Data/EditText - Nama Emergency'), Dataparampemohon.getValue('Nama Emergceny', baris), 0)
		Mobile.hideKeyboard()
		
		Mobile.delay(1)
		Mobile.setText(findTestObject('Object Repository/Form Emergency Data/EditText - No. HP Emergency'), Dataparampemohon.getValue('No Tlp Emergency', baris), 0)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/Form Emergency Data/Spinner Hub pemohon'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Emergency Data/hub ' + Dataparampemohon.getValue('Hub Emergency', baris)), 0, FailureHandling.OPTIONAL)
		
		Mobile.tap(findTestObject('Object Repository/Form Emergency Data/android.widget.Button - SIMPAN'), 0)							
	}		
}

