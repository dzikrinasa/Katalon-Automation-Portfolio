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
 * The following use case is for generating the script that creates CSV test data with StudioAssist
 */

/*
 * - Create a CSV file named 'Data Files/data.csv' using java.io, listout libraries need to import
 * - Add into data.csv file with 3 columns: Facility, Visit_Date, Comment with 5 rows that comply with the rules as follows:
 * - 'Facility' must be one of the following values: 'Tokyo CURA Healthcare Center', 'Hongkong CURA Healthcare Center', 'Seoul CURA Healthcare Center'
 * - 'Visit_Date' in dd/mm/yyyy format
 * - 'Comment' is a sentence describing issue regarding making appointment
 */

// Import necessary libraries for file handling
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

// Define the path for the CSV file
String filePath = 'Data Files/data.csv'

// Create a BufferedWriter to write to the CSV file
BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))

// Write the header row to the CSV file
writer.write('Facility,Visit_Date,Comment\n')

// Write data rows to the CSV file
writer.write('Tokyo CURA Healthcare Center,15/10/2023,Unable to select a preferred doctor for the appointment.\n')
writer.write('Hongkong CURA Healthcare Center,16/10/2023,The appointment system is not responding.\n')
writer.write('Seoul CURA Healthcare Center,17/10/2023,Received an error message while booking.\n')
writer.write('Tokyo CURA Healthcare Center,18/10/2023,The available time slots are not suitable.\n')
writer.write('Hongkong CURA Healthcare Center,19/10/2023,Could not confirm the appointment due to a system glitch.\n')

// Close the BufferedWriter to save the file
writer.close()