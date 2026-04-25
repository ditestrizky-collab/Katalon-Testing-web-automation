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

CustomKeywords.'common.WebHelper.login'('Haryadi01','qwerty123')

WebUI.click(findTestObject('Web/Home/link_findTransfer'))

WebUI.selectOptionByValue(findTestObject('Web/FindTransf/drp_account'), '13899', false)
	
WebUI.setText(findTestObject('Web/FindTransf/txt_date'), '150')
WebUI.click(findTestObject('Web/FindTransf/btn_findByDate'))

WebUI.waitForElementPresent(findTestObject('Web/FindTransf/tbl_result'), 5)


WebUI.verifyElementPresent(findTestObject('Web/FindTransf/tbl_firstRow'), 5)

WebUI.closeBrowser()
println "TC-FTR-01 ByAmount Pass - Mencari transaksi menggunakan amount berhasil"