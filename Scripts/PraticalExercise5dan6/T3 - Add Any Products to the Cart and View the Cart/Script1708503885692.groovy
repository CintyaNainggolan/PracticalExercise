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

WebUI.navigateToUrl('https://www.saucedemo.com/')

CustomKeywords.'helper.Login.login'()

String actual_result = WebUI.getText(findTestObject('Object Repository/saucedemo/Page_Swag Labs/span_Products'))

WebUI.verifyMatch(actual_result, 'Products', false)

System.out.println(WebUI.verifyElementPresent(findTestObject('Object Repository/saucedemo/Page_Swag Labs/span_Products'), 5))

WebUI.click(findTestObject('Object Repository/saucedemo3/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/saucedemo3/Page_Swag Labs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/saucedemo3/Page_Swag Labs/a_2'))

String actual_result2 = WebUI.getText(findTestObject('Object Repository/saucedemo/Page_Swag Labs/button_Continue Shopping'))

WebUI.verifyMatch(actual_result2, 'Continue Shopping', false)

System.out.println(WebUI.verifyElementPresent(findTestObject('Object Repository/saucedemo/Page_Swag Labs/button_Continue Shopping'), 5))


