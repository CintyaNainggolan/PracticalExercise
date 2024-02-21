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

WebUI.navigateToUrl('https://www.lambdatest.com/selenium-playground/radiobutton-demo')

WebUI.verifyElementPresent(findTestObject('Object Repository/radiobutton/Page_Selenium Grid Online  Run Selenium Tes_77a03b/h1_Radio button Demo'), 5)

WebUI.click(findTestObject('Object Repository/radiobutton/Page_Selenium Grid Online  Run Selenium Tes_77a03b/input_Male_optradio'))

WebUI.click(findTestObject('Object Repository/radiobutton/Page_Selenium Grid Online  Run Selenium Tes_77a03b/button_Get value'))

String actual_result = WebUI.getText(findTestObject('Object Repository/radiobutton/Page_Selenium Grid Online  Run Selenium Tes_77a03b/p_Radio button Male is checked'))

WebUI.verifyMatch(actual_result, 'Radio button \'Male\' is checked', false)

System.out.println(WebUI.verifyElementPresent(findTestObject('Object Repository/radiobutton/Page_Selenium Grid Online  Run Selenium Tes_77a03b/p_Radio button Male is checked'), 5))

WebUI.delay(4)

