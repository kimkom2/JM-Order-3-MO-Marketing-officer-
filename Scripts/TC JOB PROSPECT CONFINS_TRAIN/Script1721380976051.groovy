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
def dbUrl = GlobalVariable.URLDBTrain
def dbUser = GlobalVariable.userTrain
def dbPassword =  GlobalVariable.PassTrain
//def driver = 'com.mysql.jdbc.Driver'

// Buat objek koneksi SQL
def sql = Sql.newInstance(dbUrl, dbUser, dbPassword)

// Tulis SQL query
def query = "EXEC CONFINS_TRAIN.DBO.spInterface_CreateProspect_v2 ;SELECT TOP 1  PROSPECT_NO FROM CONFINS_TRAIN.DBO.PROSPECT WITH(NOLOCK) WHERE CONVERT(varchar, DTM_CRT, 101) = CONVERT(varchar, getdate(), 101) ORDER BY DTM_CRT DESC"
// Eksekusi query
def result = sql.rows(query)

// Tampilkan hasil
println(result)

// Tutup koneksi setelah selesai
sql.close()

