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

Mobile.tap(findTestObject('Object Repository/Form Data Aset/Form Data Asset'), 0)
Mobile.delay(3)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
{
if (Hohendy.getValue('Use', baris) == 'Yes')
	{	
		
		Mobile.tap(findTestObject('Object Repository/Form Data Aset/Spinner Asset Finance'), 0)
		Mobile.delay(1)	
		Mobile.setText(findTestObject('Object Repository/Form Data Aset/android.widget.AutoCompleteTextView'), Hohendy.getValue('Asset Finance', baris), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Data Aset/android.widget.TextView - Pilih'), 0)
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 2W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nomor Rangka'), ParamDB.getValue('NO_REGISTRASI', 1), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 4W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nomor Rangka'), ParamDB.getValue('NO_REGISTRASI', 1), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Used Bike')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nomor Rangka'), ParamDB.getValue('NO_REGISTRASI', 1), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 2W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nomor Mesin'), ParamDB.getValue('NO_REGISTRASI', 1), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 4W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nomor Mesin'), ParamDB.getValue('NO_REGISTRASI', 1), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Used Bike')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nomor Mesin'), ParamDB.getValue('NO_REGISTRASI', 1), 0)
			Mobile.hideKeyboard()
		}
		
		Mobile.tap(findTestObject('Object Repository/Form Data Aset/Spinner Pemakaian Unit'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Data Aset/Unit ' + Hohendy.getValue('Pemakaian Unit', baris)), 0, FailureHandling.OPTIONAL)
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 2W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Silinder'), Hohendy.getValue('Silinder', baris), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 4W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Silinder'), Hohendy.getValue('Silinder', baris), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Used Bike')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Silinder'), Hohendy.getValue('Silinder', baris), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 2W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Warna'), Hohendy.getValue('Warna', baris), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 4W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Warna'), Hohendy.getValue('Warna', baris), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Used Bike')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Warna'), Hohendy.getValue('Warna', baris), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 2W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nomor Polisi'), Hohendy.getValue('Nomor Polisi', baris), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Dahsyat - Multipurpose 4W')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nomor Polisi'), Hohendy.getValue('Nomor Polisi', baris), 0)
			Mobile.hideKeyboard()
		}
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Tipe Produk', baris) == 'Used Bike')
		{
			Mobile.delay(1)
			Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nomor Polisi'), Hohendy.getValue('Nomor Polisi', baris), 0)
			Mobile.hideKeyboard()
		}
				
		Mobile.swipe(0, 600, 0, 0)
		
		Mobile.delay(1)
		Mobile.setText(findTestObject('Object Repository/Form Data Aset/EditText - Nama BPKB'), Dataparampemohon.getValue('Nama Konsumen', baris), 0)
		Mobile.hideKeyboard()

		Mobile.tap(findTestObject('Object Repository/Form Data Aset/Spinner Area Kendaraan'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Data Aset/Area/Area ' + Hohendy.getValue('Area', baris)), 0, FailureHandling.OPTIONAL)
		
		Mobile.tap(findTestObject('Object Repository/Form Data Aset/android.widget.Button - SIMPAN'), 0)							
	}		
}

