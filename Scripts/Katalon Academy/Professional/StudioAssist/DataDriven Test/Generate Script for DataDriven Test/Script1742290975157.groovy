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
 * The following use case is for generating script that uses CSV file with StudioAssist
 */

/*
 * I have a list of test object:
 * - Option: Page_CURA Healthcare Service/select_Facility
 * - Health Program: Page_CURA Healthcare Service/rb_Medicaid
 * - date: Page_CURA Healthcare Service/select_Visit
 * - Comment: Page_CURA Healthcare Service/textarea_Comment
 * - Make Appointment button: Page_CURA Healthcare Service/btn_Book Appointment
 *
 * Write me a script to perform the steps as follows:
 * - Find and call the 'StudioAssist/Reusable Tests/Login' test case with the variable 'Username' as 'John Doe' and 'Password' as the Password var
 * - Select the option with the variable 'Facility' and the label is not a regex
 * - Check the health program option
 * - Set the date with the 'Visit_Date' variable
 * - Write comment with the value in 'Comment' variable
 * - Submit the appointment
 * - Capture the screenshot of the page
 * - Close the browser
 */
// Find and call the 'StudioAssist/Reusable Tests/Login' test case with the variable 'Username' as 'John Doe' and 'Password' as the Password var
WebUI.callTestCase(findTestCase('StudioAssist/Reusable Tests/Login'), 
    [('Username') : 'John Doe', ('Password') : Password], FailureHandling.STOP_ON_FAILURE)

// Select the option with the variable 'Facility' and the label is not a regex
WebUI.selectOptionByLabel(findTestObject('Page_CURA Healthcare Service/select_Facility'), 
    Facility, false)

// Check the health program option
WebUI.check(findTestObject('Page_CURA Healthcare Service/rb_Medicaid'))

// Set the date with the 'Visit_Date' variable
WebUI.setText(findTestObject('Page_CURA Healthcare Service/select_Visit'), 
    Visit_Date)

// Write comment with the value in 'Comment' variable
WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment'), 
    Comment)

// Submit the appointment
WebUI.click(findTestObject('Page_CURA Healthcare Service/btn_Book Appointment'))

// Capture the screenshot of the page
WebUI.takeScreenshot()

// Close the browser
WebUI.closeBrowser()
