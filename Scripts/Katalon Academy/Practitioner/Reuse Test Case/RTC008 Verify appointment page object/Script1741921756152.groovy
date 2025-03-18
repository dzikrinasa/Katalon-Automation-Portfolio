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

WebUI.callTestCase(findTestCase('Katalon Academy/Practitioner/Reuse Test Case/RTC001_Login into Application'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/#appointment')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'), 'Make Appointment')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Facility'), 'Facility')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Healthcare Program'), 'Healthcare Program')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Visit Date (Required)'), 'Visit Date (Required)')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Comment'), 'Comment')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'), 'Book Appointment')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/section_Make Appointment                   _57f49e'), 
    0)

