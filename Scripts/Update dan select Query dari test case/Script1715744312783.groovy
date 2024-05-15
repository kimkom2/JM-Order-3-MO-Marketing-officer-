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
//def dbUser = 'collsys'
//def dbPassword = 'collsys123$'
//def driver = 'com.mysql.jdbc.Driver'

//def dbUrlFixed = dbUrl.replace('\', '/')

println(dbUrl)

// Buat objek koneksi SQL
//def sql = Sql.newInstance(dbUrl, dbUser, dbPassword)
//
//// Tulis SQL query
////def query = "SELECT top 1 * FROM datapengajuan"
//def query = "update Collection.jmfi_trx_ar_2 set od_hari ='3' where id_booking ='002/1.01.0000007/01' SELECT top 1 id_booking,od_hari FROM Collection.jmfi_trx_ar_2 where id_booking ='002/1.01.0000007/01'"
////def query = "SELECT top 1 id_booking,od_hari FROM Collection.jmfi_trx_ar_2 where id_booking ='002/1.01.0000007/01'"
////def query = "update datapengajuan set reffnumber ='HOHO01' where no_registrasi ='W539240500006'"
//
//// Eksekusi query
//def result = sql.rows(query)

// Tampilkan hasil


// Tutup koneksi setelah selesai
//sql.close()

