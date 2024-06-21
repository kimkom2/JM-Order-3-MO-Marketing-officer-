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

Mobile.tap(findTestObject('Object Repository/Form Asuransi/Form asuransi'), 0)
Mobile.delay(4)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
{
if (Hohendy.getValue('Use', baris) == 'Yes')
	{	
		
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Spinner Asuransi'), 0)
		Mobile.delay(2)	
		Mobile.setText(findTestObject('Object Repository/Form Asuransi/android.widget.AutoCompleteTextView'), Hohendy.getValue('Asuransi', baris), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/android.widget.TextView - Pilih'), 0)
		
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Spinner Asuransi Dibayar'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Bayar ' + Hohendy.getValue('Bayar Asuransi', baris)), 0, FailureHandling.OPTIONAL)
		
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Spinner Jangka waktu Asurnasi'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Waktu/Waktu ' + Hohendy.getValue('Jangka Waktu', baris)), 0, FailureHandling.OPTIONAL)
		
		Mobile.delay(1)
		Mobile.setText(findTestObject('Object Repository/Form Asuransi/EditText - Periode Asuransi Kendaraan (bulan)'), Hohendy.getValue('Tenor', baris), 0)
		Mobile.hideKeyboard()
		
		Mobile.delay(1)
		Mobile.setText(findTestObject('Object Repository/Form Asuransi/EditText - Nilai Pertanggungan'), Hohendy.getValue('Harga Kendaraan', baris), 0)
		Mobile.hideKeyboard()
		
		Mobile.delay(1)
		Mobile.setText(findTestObject('Object Repository/Form Asuransi/EditText - Jenis Pertanggungan All Risk'), Hohendy.getValue('Tenor', baris), 0)
		Mobile.hideKeyboard()
		Mobile.delay(1)
		
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Spinner Srcc'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Pilih/Pilih ' + Hohendy.getValue('SRCC', baris)), 0, FailureHandling.OPTIONAL)
		
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Spinner Banjir'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Pilih/Pilih ' + Hohendy.getValue('SRCC', baris)), 0, FailureHandling.OPTIONAL)
				
	while (true)
		{
			if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Asuransi/Spinner Asuransi Jiwa'), 1, FailureHandling.OPTIONAL) == true) // step 1
			{
				Mobile.swipe(0, 600, 0, 0)
			}
			else
			{
				Mobile.tap(findTestObject('Object Repository/Form Asuransi/Spinner Gempa Bumi'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form Asuransi/Pilih/Pilih ' + Hohendy.getValue('Gempa Bumi', baris)), 0, FailureHandling.OPTIONAL)

				Mobile.tap(findTestObject('Object Repository/Form Asuransi/Spinner TPL'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form Asuransi/Pilih/Pilih ' + Hohendy.getValue('TPL', baris)), 0, FailureHandling.OPTIONAL)
				
				Mobile.tap(findTestObject('Object Repository/Form Asuransi/Spinner PA'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form Asuransi/Pilih/Pilih ' + Hohendy.getValue('PA', baris)), 0, FailureHandling.OPTIONAL)
				break
			}
		}

		Mobile.swipe(0, 1600, 0, 0)
		
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Spinner Asuransi Jiwa'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/Pilih/Pilih ' + Hohendy.getValue('Asuransi Jiwa', baris)), 0, FailureHandling.OPTIONAL)
		
		Mobile.swipe(0, 600, 0, 0)
		
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Asuransi/android.widget.Button - SIMPAN'), 0)
		
		Mobile.delay(3)
							
	}		
}

