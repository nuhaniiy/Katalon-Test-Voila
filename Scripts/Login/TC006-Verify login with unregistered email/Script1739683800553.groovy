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

WebUI.navigateToUrl('https://voila.id/')
WebUI.maximizeWindow()
WebUI.delay(3)
WebUI.sendKeys(findTestObject('Body'), Keys.chord(Keys.ESCAPE))
WebUI.click(findTestObject('Object Repository/allow notif'))
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Login/button_Sign In (10)'))
WebUI.takeScreenshot()

WebUI.setText(findTestObject('Object Repository/Login/input_Chasing ON Love Exclusive IDR 150K Ju_a78a44'), 'nuhaniiy@gmail.com')
WebUI.delay(3)
WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Login/button_Sign In'))
WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Text Register'), 0)
WebUI.takeScreenshot()

WebUI.closeBrowser()

