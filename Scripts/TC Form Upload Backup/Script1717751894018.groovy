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

Mobile.tap(findTestObject('Object Repository/Form Upload 2/Upload Tools Perhitungan Angsuran'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/ImageButton'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/Button - TOOLS PERHITUNGAN ANGSURAN'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/Capture photo from camera'), 0)

Mobile.delay(1)

Mobile.tapAtPosition(535, 1989, FailureHandling.OPTIONAL)

Mobile.delay(3)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/OK'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/Upload 2/Button - SIMPAN DATA'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/Upload 2/ImageButton Back'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/Upload 2/ImageButton Back 2'), 0)

Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Upload 2/Upload 2/Kirim'), 0)



