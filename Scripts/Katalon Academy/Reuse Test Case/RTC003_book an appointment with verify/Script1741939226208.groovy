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

WebUI.selectOptionByValue(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/select_Facility'), 
    healtcareCenter, true)

WebUI.click(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/checkbox_Apply for hospital readmission'))

WebUI.click(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/input_Visit Date'))

WebUI.click(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/select_Visit Date'))

WebUI.setText(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/textarea_Comment'), comment)

WebUI.click(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/btn_Book Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    title)

WebUI.verifyElementText(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/p_Please be informed that your appointment _11813a'), 
    information)

WebUI.verifyElementPresent(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/p_Medicare'), label)

WebUI.verifyElementText(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/p_Hongkong CURA Healthcare Center'), 
    healtcareCenter)

WebUI.verifyElementText(findTestObject('Object Repository/OR Cura/Page_CURA Healthcare Service/p_Test'), comment)

