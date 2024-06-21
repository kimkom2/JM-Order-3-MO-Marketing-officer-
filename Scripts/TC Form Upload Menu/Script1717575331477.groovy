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

TestData ParamDB = findTestData('Data Files/Param MO MAP')

TestData Hohendy = findTestData('Data Files/Param Pengajuan')

TestData Dataparampemohon = findTestData('Data Files/Param Pemohon')

//Mobile.startExistingApplication('id.co.jmpmf.jmo3')

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form upload Menu/Form Upload'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/Sync Form/Button Sync'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/Sync Form/Sinkronisasi Data'), 0)

Mobile.delay(5)

Mobile.tap(findTestObject('Object Repository/Form upload Menu/TextView Search'), 0)

Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form upload Menu/Telusuri'), ParamDB.getValue('NO_REGISTRASI', 1), 0)

Mobile.delay(1)

Mobile.tapAtPosition(987, 2120, FailureHandling.OPTIONAL)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form upload Menu/android.widget.RelativeLayout'), 0)

