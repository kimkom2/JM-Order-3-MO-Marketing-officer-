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
TestData ParamDB_CO = findTestData('Data Files/Param Credit officer')
TestData Hohendy = findTestData('Data Files/Param Pengajuan')
TestData Dataparampemohon = findTestData('Data Files/Param Pemohon')

//Mobile.startExistingApplication('id.co.jmpmf.jmo3')

Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Form MAP Surveyor'), 0)
WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/MAP Surveyor/android.widget.AutoCompleteTextView - Masukkan kata kunci'), 0)
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/MAP Surveyor/android.widget.AutoCompleteTextView - Masukkan kata kunci'), ParamDB_CO.getValue('NO_REGISTRASI', 1), 0)
Mobile.delay(1)

Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Pilih 0'), 0)
Mobile.delay(1)

if (ParamDB_CO.getValue('status', 1) == '202')
{
	Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Button - YA'), 0)
	Mobile.delay(4)
}

Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Data pribadi'), 0)
Mobile.delay(1)

for (int baris = 1; baris <= Dataparampemohon.getRowNumbers(); baris++)
{
if (Dataparampemohon.getValue('Use', baris) == 'Yes')
	{	
		Mobile.setText(findTestObject('Object Repository/MAP Surveyor/EditText - Nomor Kartu Keluarga'), Dataparampemohon.getValue('NO KK', baris), 0)
		Mobile.hideKeyboard()
		Mobile.delay(1)
			
		Mobile.setText(findTestObject('Object Repository/MAP Surveyor/EditText - Nama Lengkap (Tanpa Singkatan)'), Dataparampemohon.getValue('Nama Konsumen', baris), 0)
		Mobile.hideKeyboard()
		Mobile.delay(1)
		
		Mobile.setText(findTestObject('Object Repository/MAP Surveyor/EditText - Nama PanggilanAlias'), Dataparampemohon.getValue('Nama Konsumen', baris), 0)
		Mobile.hideKeyboard()
		Mobile.delay(1)
		
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Agama/Spinner Agama'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Agama/Agama ' + Dataparampemohon.getValue('Agama', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
	while (true)
		{
			if (Mobile.verifyElementNotExist(findTestObject('Object Repository/MAP Surveyor/Lokasi/Spinner Lokasi Pemakaian Asset'), 1, FailureHandling.OPTIONAL) == true) // step 1
			{
				Mobile.swipe(0, 600, 0, 0)
			}
			else
			{
				Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Lokasi Rumah/Spinner Lokasi rumah'), 0)
				Mobile.delay(1)
				Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Lokasi Rumah/Lokasi ' + Dataparampemohon.getValue('Lokasi Rumah', baris)), 0, FailureHandling.OPTIONAL)
				Mobile.hideKeyboard()
				
				break
			}
		}

		Mobile.swipe(0, 600, 0, 0)
				
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Lokasi/Spinner Lokasi Pemakaian Asset'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Lokasi/Lokasi ' + Dataparampemohon.getValue('Lokasi Pemakaian Asset', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Jarak Tempuh/Spinner Jarak Tempuh'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Jarak Tempuh/Jarak ' + Dataparampemohon.getValue('Jarak Tempuh', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.swipe(0, 600, 0, 0)
		
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Pendidikan/Spinner Pendidikan Terakhir'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Pendidikan/Pendidikan ' + Dataparampemohon.getValue('Pendidikan Terakhir', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Surat/Spinner Pengiriman surat'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/Surat/Surat ' + Dataparampemohon.getValue('Pengiriman surat', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.swipe(0, 600, 0, 0)
		
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/android.widget.Button - SIMPAN'), 0)			
		WebUI.delay(2)
		
		Mobile.tap(findTestObject('Object Repository/MAP Surveyor/android.widget.Button - SUBMIT'), 0)
		WebUI.delay(4)
	}		
}

