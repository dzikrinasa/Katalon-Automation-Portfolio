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
 * Use Case for generating script that calls other script
 */

/*
 * Write a katalon studio test case to perform this following steps:
 *
 * I have a list of test objects as below:
 * - Option: Page_CURA Healthcare Service/select_Facility
 * - Health Program: Page_CURA Healthcare Service/rb_Medicaid
 * - date: Page_CURA Healthcare Service/select_Visit
 * - Comment: Page_CURA Healthcare Service/textarea_Comment
 * - Make Appointment button: Page_CURA Healthcare Service/btn_Book Appointment
 * 
 * Write me a test case to perform the following steps.
 * 1. Find and call the 'Katalon Academy/Professional/StudioAssist/Reusable Test/Login' test case with the variable 'username' as 'John Doe' and password local variable in login
 * 2. Select the option with the lable 'Hongkong CURA Health Center' and the label is not regex
 * 3. Check the health program
 * 4. Set the date to '11/07/2024'
 * 5. Write 'Appointment for hongkong' as soon as possible on comment
 * 6. submit the appointment
 * 7. capture the screenshot of the page
 * 8. Close the browser
*/
// Step 1: Call the login test case with specified parameters
WebUI.callTestCase(findTestCase('Katalon Academy/Professional/StudioAssist/Reusable Test/Login'), 
    [('username') : 'John Doe', ('password') : 'ThisIsNotAPassword'], FailureHandling.STOP_ON_FAILURE)

// Step 2: Select the facility option 'Hongkong CURA Health Center'
WebUI.selectOptionByLabel(findTestObject('Page_CURA Healthcare Service/select_Facility'), 'Hongkong CURA Healthcare Center', true)

// Step 3: Check the health program
WebUI.check(findTestObject('Page_CURA Healthcare Service/rb_Medicaid'))

// Step 4: Set the date to '11/07/2024'
WebUI.setText(findTestObject('Page_CURA Healthcare Service/input_Visit Date'), '11/07/2024')

// Step 5: Write a comment
WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment'), 'Appointment for hongkong')

// Step 6: Submit the appointment
WebUI.click(findTestObject('Page_CURA Healthcare Service/btn_Book Appointment'))

// Step 7: Capture a screenshot of the page
WebUI.takeScreenshot()

// Step 8: Close the browser
WebUI.closeBrowser()