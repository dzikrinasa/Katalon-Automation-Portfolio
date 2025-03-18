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
 * Use Case for generating login step
 */
/*
 * Write a katalon studio test case to perform this following steps:
 *
 * I have a list of test objects as below:
 * - Make appointment button: Page_CURA Healthcare Service/btn_Make Appointment
 * - Username: Page_CURA Healthcare Service/input_Username
 * - Password: Page_CURA Healthcare Service/input_Password
 * - Login button: Page_CURA Healthcare Service/btn_Login
 * - I also have a URL: GlobalVariable.URL, and two local variables 'username' and 'password'
 *
 * Write me a test case to perform the following steps.
 * 1. Open browser to the URL stored in URL
 * 2. Click the make appointment button
 * 3. Fill in the username and password fields based on the variables
 * 4. Click the login button
*/
// Open the browser to the specified URL
WebUI.openBrowser(GlobalVariable.URL)
// Click the make appointment button
WebUI.click(findTestObject('Page_CURA Healthcare Service/btn_Make Appointment'))
// Set the username in the username field
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Username'), username)
// Set the password in the password field
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Password'), password)
// Click the login button
WebUI.click(findTestObject('Page_CURA Healthcare Service/btn_Login'))