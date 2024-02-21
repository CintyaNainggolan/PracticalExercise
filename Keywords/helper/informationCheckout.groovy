package helper
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class InformationCheckout {

	@Keyword
	def informationCheckout() {
		def testData = TestDataFactory.findTestData('Data Files/dataProduct')
		def firstName = testData.getValue('firstName', 1)
		def lastName = testData.getValue('lastName', 1)
		def postalCode = testData.getValue('postalCode', 1)

		WebUI.setText(findTestObject('Object Repository/saucedemo4/Page_Swag Labs/input_Checkout Your Information_firstName'), firstName)
		WebUI.setText(findTestObject('Object Repository/saucedemo4/Page_Swag Labs/input_Checkout Your Information_lastName'), lastName)
		WebUI.setText(findTestObject('Object Repository/saucedemo4/Page_Swag Labs/input_Checkout Your Information_postalCode'), postalCode)
		WebUI.click(findTestObject('Object Repository/saucedemo5/Page_Swag Labs/input_Cancel_continue'))
	}
}
