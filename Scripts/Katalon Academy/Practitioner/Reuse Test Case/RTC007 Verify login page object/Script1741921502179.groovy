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

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Please login to make appointment'), 30)

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Demo account'), 'Demo account')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control_1'), 
    '')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Username'), 'Username')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Password'), 'Password')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'), 'Login')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Demo account                           _56eb59'), 
    0)

