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

WebUI.navigateToUrl(GlobalVariable.url + '/gender/women-618')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Object Repository/Filtering/text filter'), 0)
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Filtering/text preorder1'))
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Filtering/text available voucher'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Filtering/text preorder2'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Filtering/text filter'), 0)
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Filtering/text jakarta moi 1'))
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Filtering/text available voucher'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/Filtering/text product not found'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot()

WebUI.closeBrowser()