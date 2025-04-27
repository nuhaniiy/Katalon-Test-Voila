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

WebUI.openBrowser('')

//ini kamu buka url yang sudah di filter ready stock, preloved
WebUI.navigateToUrl(GlobalVariable.url + '/gender/women-618?stockAvailability=isReadyStock,isPreloved&page=1')

WebUI.maximizeWindow()
WebUI.delay(3)
// ini ngilangin register
WebUI.sendKeys(findTestObject('Body'), Keys.chord(Keys.ESCAPE))
WebUI.click(findTestObject('Object Repository/allow notif'))

WebUI.scrollToElement(findTestObject('Object Repository/Filtering/text filter'), 0)
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Filtering/text filter'))
WebUI.takeScreenshot()

//ini uncheck ready stock
WebUI.click(findTestObject('Object Repository/Filtering/text ready stock'))
WebUI.takeScreenshot()

//klik tombol show result
WebUI.click(findTestObject('Object Repository/Filtering/btn show result'))

//scroll ke available voucher
WebUI.scrollToElement(findTestObject('Object Repository/Filtering/text available voucher'), 0)

//verifikasi text ready stock yang filter gak ada
WebUI.verifyElementNotPresent(findTestObject('Object Repository/Filtering/text ready stock 2'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot()


//close brwoser
WebUI.closeBrowser()