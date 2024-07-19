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

Mobile.tap(findTestObject('Object Repository/Form Survey/Survey RCA/Menu Data RCA'), 0)
Mobile.delay(2)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/Character'),'Character by Katalon', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/Collateral'),'Collateral by Katalon', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/Capital'),'Capital by Katalon', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/EditText - Bukti kepemilikan unit lain tersebut'),'kepemilikan unit lain by Katalon', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/Condition'),'Condition by Katalon', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/Condition info lain nya'),'Condition info lain by Katalon', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/Capacity'),'100000', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/Angsuran tempat lain'),'2000000', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/DSR'),'50000', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.swipe(0, 900, 0, 0)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/Hasil Survey Domisili'),'Hasil Survey Domisili by Katalon', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Survey RCA/RCA2/Detail hasil survey tempat kerja'),'Detail hasil survey tempat kerja by Katalon', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/Form Survey/Survey RCA/RCA2/Spinner Kesimpulan'), 0)
Mobile.delay(1)
Mobile.tap(findTestObject('Object Repository/Form Survey/Survey RCA/RCA2/Rekomendasi'), 0)
Mobile.hideKeyboard()

Mobile.swipe(0, 900, 0, 0)

Mobile.tap(findTestObject('Object Repository/Form Survey/Survey RCA/RCA2/android.widget.Button - SIMPAN'), 0)


