package examples

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyKeyword {
	@Keyword
	def Login(String username, String password) {

		WebUI.click(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/btn_menu toggle'))

		WebUI.click(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/btn_menu Login'))

		WebUI.click(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/input_Demo account_form-control'))

		WebUI.setText(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/input_Username'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/input_Password'), password)

		WebUI.click(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/btn_Login'))
	}
	
	@Keyword
	def Conrats(String user) {
		println('Conrats '+user+' You finish the test case!')
	}
}
