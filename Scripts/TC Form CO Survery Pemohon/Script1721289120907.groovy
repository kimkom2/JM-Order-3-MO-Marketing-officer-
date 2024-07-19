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

Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Survey Pemohon'), 0)
Mobile.delay(2)

for (int baris = 1; baris <= Hohendy.getRowNumbers(); baris++)
{
if (Hohendy.getValue('Use', baris) == 'Yes')
	{	
		Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Ambil Foto'), 0)
		Mobile.delay(3)
		Mobile.tap(findTestObject('Object Repository/Form Pemohon/Capture photo from camera'), 0)
		Mobile.delay(3)
		Mobile.tapAtPosition(568, 2014, FailureHandling.OPTIONAL)
		Mobile.delay(5)
		Mobile.tap(findTestObject('Object Repository/Form Pemohon/Button - OK Camera'), 0)
		Mobile.delay(2)
		
		while (true)
			{
				if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Form Survey/Survey Pemohon/Garasi Cekbox/CheckBox - Tidak ada garasi'), 1, FailureHandling.OPTIONAL) == true) // step 1
				{
					Mobile.swipe(0, 600, 0, 0)
				}
				else
				{
					Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/EditText - Detil Tujuan Pembiayaan'), 0)
					Mobile.delay(1)
					Mobile.setText(findTestObject('Object Repository/Form Survey/Survey Pemohon/EditText - Detil Tujuan Pembiayaan'), Hohendy.getValue('Tujuan Pembiayaan', baris), 0)
					Mobile.hideKeyboard()
					
					Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Spinner Kondisi Tempat Tinggal'), 0)
					Mobile.delay(1)
					Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Tempat tinggal/Tempat ' + Hohendy.getValue('Kondisi tempat tinggal', baris)), 0, FailureHandling.OPTIONAL)
					
					Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/CheckBox - Gang Lebar (cukup 2 mobil berpapasan)'), 0)
					Mobile.delay(1)
					
					Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Spinner Penampakan Depan rumah'), 0)
					Mobile.delay(1)
					Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Rawat/Rawat ' + Hohendy.getValue('Akses Jalan Masuk', baris)), 0, FailureHandling.OPTIONAL)
					break
				}
			}
			
		Mobile.swipe(0, 900, 0, 0)
		
		Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Spinner Ormas'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Ormas/Ormas Tidak'), 0, FailureHandling.OPTIONAL)
		
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Garasi', baris) == 'Garasi Cukup Mobil')
		{
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Garasi Cekbox/CheckBox - Garasi Cukup Mobil'), 0)
		}

		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Garasi', baris) == 'Tidak ada garasi')
		{
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Garasi Cekbox/CheckBox - Tidak ada garasi'), 0)
		}
				
		if (Hohendy.getValue('Use', baris) == 'Yes' && Hohendy.getValue('Garasi', baris) == 'Garasi Cukup Motor')
		{
			Mobile.delay(1)
			Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Garasi Cekbox/CheckBox - Garasi Cukup Motor'), 0)
		}
		
		Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Dana/Spinner Sumber dana DP'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Dana/Dana ' + Hohendy.getValue('Sumber DP', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
		
		Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Restruktur/Spinner Restruktur'), 0)
		Mobile.delay(1)
		Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Restruktur/Res ' + Hohendy.getValue('Restruktur', baris)), 0, FailureHandling.OPTIONAL)
		Mobile.hideKeyboard()
									
		Mobile.tap(findTestObject('Object Repository/Form Survey/Survey Pemohon/Button - SIMPAN'), 0)							
	}		
}

