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

WebUI.callTestCase(findTestCase('Login/TC001-Verify successful login with valid credentials'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/allow notif'), 3, FailureHandling.OPTIONAL)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/allow notif'))
WebUI.takeScreenshot()
WebUI.acceptAlert(FailureHandling.OPTIONAL)
WebUI.click(findTestObject('Object Repository/Searching/search bar'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Searching/input search'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot()
WebUI.setText(findTestObject('Object Repository/Searching/input search'), 'Asics')
WebUI.takeScreenshot()
WebUI.sendKeys(findTestObject('Object Repository/Searching/input search'), Keys.chord(Keys.ENTER))
WebUI.delay(5)
WebUI.waitForPageLoad(20)
WebUI.takeScreenshot()


WebUI.click(findTestObject('Object Repository/Add to Bag/Asics'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Bag/Asics 2'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot()

WebUI.scrollToElement(findTestObject('Object Repository/Add to Bag/selectsize'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Add to Bag/Add to Bag'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(1)
WebUI.takeScreenshot()
WebUI.click(findTestObject('Object Repository/Add to Bag/Bag Menu'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Bag/Asics 3'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot()

WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Bag/tambah qty product'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Add to Bag/tambah qty product'), FailureHandling.STOP_ON_FAILURE)
WebUI.delay(2)
WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Bag/verif 2 qty'), 0, FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot()

WebUI.closeBrowser()