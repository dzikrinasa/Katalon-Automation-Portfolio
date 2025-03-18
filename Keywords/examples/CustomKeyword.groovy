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
import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.util.KeywordUtil
import org.openqa.selenium.WebElement

public class CustomKeyword {
	/**
	 * this prompt is for generating custom keyword with studio assist to click an element that we pass in th function
	 */
	
	/*
	 * Write me a ClickElement keyword that receive a test object id of type string and does as follows
	 * 1. Click the element
	 * 2. if cannot click the element, catch WebElementNotFoundException exception and use KeywordUtil.markFailed to say that you cannot find the element
	 * 3. If other errors, catch Exception saying that you failed to click element with the KeywordUtil.markFailed
	 * 4. Otherwise, mark the keyword as succeed
	 */

/**
 * Clicks on a specified test object.
 *
 * @param testObjectId The ID of the test object to be clicked.
 */
@Keyword
def ClickElement(String testObjectId) {
    try {
        // Find the test object using its ID
        TestObject testObject = findTestObject(testObjectId)
        // Click the element
        WebUI.click(testObject)
        // Mark the keyword as succeeded
        KeywordUtil.markPassed("Successfully clicked the element: " + testObjectId)
    } catch (WebElementNotFoundException e) {
        // Handle the case where the element cannot be found
        KeywordUtil.markFailed("Cannot find the element: " + testObjectId)
    } catch (Exception e) {
        // Handle any other exceptions that occur during the click
        KeywordUtil.markFailed("Failed to click the element: " + testObjectId + ". Error: " + e.message)
    }
}
}
