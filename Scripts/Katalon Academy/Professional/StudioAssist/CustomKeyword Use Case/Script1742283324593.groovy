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

/**
 * This following use case is to generate script for using custom keyowrd
 */

/**
 * 1. Open a browser to the url in the GlobalVariable.URL
 * 2. Click the make appointment button with id 'Page_CURA Healthcare Service/btn_Make Appointment' using 'examples.CustomKeyword.ClickElement'(String testObjectID) custom keyword
 * 3. Fill in the username 'Page_CURA Healthcare Service/input_Username' with the local variable 'username'
 * 4. Fill in the password 'Page_CURA Healthcare Service/input_Password' with the local variable 'password'
 * 5. Click login with the id 'Page_CURA Healthcare Service/btn_Login' with same 'ClickElement' Custom keyword
 * 6. Verify that the input 'Page_CURA Healthcare Service/rb_Medicaid' exist with timeout 10s
 * 7. Close the browser
*/
// Open a browser to the url in the GlobalVariable.URL
WebUI.openBrowser(GlobalVariable.URL)

// Click the make appointment button with id 'Page_CURA Healthcare Service/btn_Make Appointment' using 'examples.CustomKeyword.ClickElement'(String testObjectID) custom keyword
CustomKeywords.'examples.CustomKeyword.ClickElement'('Page_CURA Healthcare Service/btn_Make Appointment')

// Fill in the username 'Page_CURA Healthcare Service/input_Username' with the local variable 'username'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username'), 'John Doe')

// Fill in the password 'Page_CURA Healthcare Service/input_Password' with the local variable 'password'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password'), 'ThisIsNotAPassword')

// Click login with the id 'Page_CURA Healthcare Service/btn_Login' with same 'ClickElement' Custom keyword
CustomKeywords.'examples.CustomKeyword.ClickElement'('Page_CURA Healthcare Service/btn_Login')

// Verify that the input 'Page_CURA Healthcare Service/rb_Medicaid' exist with timeout 10s
WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/rb_Medicaid'), 10)

// Close the browser
WebUI.closeBrowser()
