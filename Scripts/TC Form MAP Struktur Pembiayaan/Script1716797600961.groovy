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

Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Form Struktur pembiayaan'), 0)
WebUI.delay(1)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
{
if (Hohendy.getValue('Use', baris) == 'Yes')
	{		
		Mobile.setText(findTestObject('Object Repository/Form Struktur Pembiayaan/EditText - Angsuran'), Hohendy.getValue('Angsuran', baris), 0)
		Mobile.hideKeyboard()
		Mobile.delay(1)
		
		Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Spinner Pembayaran Angsuran'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Pem ' + Hohendy.getValue('Cara bayar', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.setText(findTestObject('Object Repository/Form Struktur Pembiayaan/EditText - Biaya Admin'), Hohendy.getValue('Biaya Admin', baris), 0)
		Mobile.hideKeyboard()
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Admin Cap', baris) == 'Yes')
		{
			Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Capitalize/CheckBox - Capitalize BiayaAdmin'), 0)
		}
		
		Mobile.setText(findTestObject('Object Repository/Form Struktur Pembiayaan/EditText - Biaya Fidusia'), Hohendy.getValue('Biaya Fiducia', baris), 0)
		Mobile.hideKeyboard()
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Fiducia Cap', baris) == 'Yes')
		{
			Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Capitalize/CheckBox - Capitalize BiayaFidusia'), 0)
		}
		
		Mobile.setText(findTestObject('Object Repository/Form Struktur Pembiayaan/EditText - Biaya Survey'), Hohendy.getValue('Biaya Survey', baris), 0)
		Mobile.hideKeyboard()
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Survey Cap', baris) == 'Yes')
		{
			Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Capitalize/CheckBox - Capitalize Biaya Survey'), 0)
		}
		
		Mobile.setText(findTestObject('Object Repository/Form Struktur Pembiayaan/EditText - Biaya Provisi Persen'), Hohendy.getValue('Provisi Persen', baris), 0)
		Mobile.hideKeyboard()
		
		Mobile.setText(findTestObject('Object Repository/Form Struktur Pembiayaan/EditText - Biaya Provisi'), Hohendy.getValue('Biaya Provisi', baris), 0)
		Mobile.hideKeyboard()
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Provisi Cap', baris) == 'Yes')
		{
			Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Capitalize/CheckBox - Capitalize Biaya Provisi'), 0)
		}
		
	
	while (true)
		{
			if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Struktur Pembiayaan/Pencairan Dana/Spinner Pencairan dana'), 1, FailureHandling.OPTIONAL) == true) // step 1
			{
				Mobile.swipe(0, 600, 0, 0)
			}
			else
			{
				Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Spinner Interest Type'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Type '+ Hohendy.getValue('Type', baris)), 0, FailureHandling.OPTIONAL)
				
				Mobile.setText(findTestObject('Object Repository/Form Struktur Pembiayaan/Rate/EditText - Rate'), Hohendy.getValue('Rate', baris), 0)
				Mobile.hideKeyboard()
				
				Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Rate/Spinner Angsuran'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Rate/Skema '+ Hohendy.getValue('Skema', baris)), 0, FailureHandling.OPTIONAL)
				
				Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Tipe Angsuran/Spinner Tipe Angsuran'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Tipe Angsuran/Tipe '+ Hohendy.getValue('Tipe Angsuran', baris)), 0, FailureHandling.OPTIONAL)
				
				break
			}
		}

		Mobile.swipe(0, 600, 0, 0)
				
		Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Pencairan Dana/Spinner Pencairan dana'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/Pencairan Dana/Dana '+ Hohendy.getValue('Pencairan Dana', baris)), 0, FailureHandling.OPTIONAL)		
		Mobile.delay(1)	
		
		Mobile.tap(findTestObject('Object Repository/Form Struktur Pembiayaan/android.widget.Button - SIMPAN'), 0)			
		Mobile.delay(4)
	}		
}

