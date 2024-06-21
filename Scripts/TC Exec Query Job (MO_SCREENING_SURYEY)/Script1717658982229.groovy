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

import groovy.sql.Sql

// Inisialisasi koneksi ke database
def dbUrl = GlobalVariable.DB_URL_DEV_20
def dbUser = GlobalVariable.User_DB_DEV
def dbPassword =  GlobalVariable.db_dev_pas
//def driver = 'com.mysql.jdbc.Driver'

// Buat objek koneksi SQL
def sql = Sql.newInstance(dbUrl, dbUser, dbPassword)

// Tulis SQL query
//def query = "SELECT TOP 1 NO_REGISTRASI,created_at,status FROM DATAPENGAJUAN WHERE STATUS IN('27') AND CONVERT(varchar, created_at, 101) = CONVERT(varchar, getdate(), 101)"
def query = "exec [JMPMFI_Mobile]..MO_SCREENING_SURYEY select top 1 no_registrasi,is_surveyor from [JMPMFI_Mobile]..mo_map where 1=1 AND CONVERT(varchar, upddtm, 101) = CONVERT(varchar, getdate(), 101) order by upddtm desc"

// Eksekusi query
def result = sql.rows(query)

// Tampilkan hasil
println(result)

// Tutup koneksi setelah selesai
sql.close()

