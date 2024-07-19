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

Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Menu Data Pekerjaan'), 0)
Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Spinner Pekerjaan'), 0)
Mobile.delay(1)
Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/android.widget.AutoCompleteTextView'),'Pegawai swasta', 0)
Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Pilih 0'), 0)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Spinner Bidang Usaha'), 0)
Mobile.delay(1)
Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/android.widget.AutoCompleteTextView'),'1143', 0)
Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Pilih 0'), 0)
Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/EditText - Nama Perusahaan'),'PT oke oke ajah', 0)
Mobile.delay(1)
Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/EditText - Kode Area  No. Kantor'),'081888622533', 0)
Mobile.delay(1)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Spinner Status pekerjaan'), 0)
Mobile.delay(1)
Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Stat Permanen'), 0)
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Spinner Posisi Jabatan'), 0)
Mobile.delay(1)
Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/android.widget.AutoCompleteTextView'),'Bukan Pemilik - Lainnya', 0)
Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Pilih 0'), 0)
Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/EditText - Alamat Kantor'),'Halo hala bandung udahh panjang tambah panjang', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/EditText - RT'),'012', 0)
Mobile.hideKeyboard()
Mobile.delay(1)

			while (true)
			{
					if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Survey/Data pekerjaan/Kelurahan/android.widget.Button - SIMPAN'), 1, FailureHandling.OPTIONAL) == true) // step 1
					{
						Mobile.swipe(0, 600, 0, 0)
					}
					else
					{
						Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/EditText - RW'),'003', 0)
						Mobile.hideKeyboard()
						Mobile.delay(1)
						
						Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Spinner Kota'), 0)
						Mobile.delay(1)
						Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/android.widget.AutoCompleteTextView'),'DEPOK', 0)
						Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Pilih 0'), 0)
						Mobile.hideKeyboard()
						
						Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Spinner Kecamatan'), 0)
						Mobile.delay(1)
						Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/android.widget.AutoCompleteTextView'),'BEJI', 0)
						Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Pilih 0'), 0)
						Mobile.hideKeyboard()
						
						Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Kelurahan/Spinner Kelurahan'), 0)
						Mobile.delay(1)
						Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/android.widget.AutoCompleteTextView'),'BEJI', 0)
						Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Pilih 0'), 0)
						Mobile.hideKeyboard()
						
						Mobile.setText(findTestObject('Object Repository/Form Survey/Data pekerjaan/Kelurahan/EditText - Pendapatan perbulan'),'10000000', 0)
						Mobile.hideKeyboard()
						Mobile.delay(1)
					break
					}
			}
			
Mobile.swipe(0, 600, 0, 0)

Mobile.tap(findTestObject('Object Repository/Form Survey/Data pekerjaan/Kelurahan/android.widget.Button - SIMPAN'), 0)							


