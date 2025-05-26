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
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.chrome.ChromeOptions

// Set Download path on "Data Files" directory
String downloadPath = RunConfiguration.getProjectDir() + '/Data Files'
Map<String, Object> prefs = new HashMap()
prefs.put('download.default_directory', downloadPath.replace('/', '\\'))
ChromeOptions options = new ChromeOptions()
options.setExperimentalOption('prefs', prefs)
DriverFactory.changeWebDriver(new org.openqa.selenium.chrome.ChromeDriver(options))

WebUI.navigateToUrl('https://demo.automationtesting.in/FileDownload.html')

WebUI.maximizeWindow()

WebUI.scrollToElement(findTestObject('Object Repository/Page_Download File/a_Download'), 30)

WebUI.click(findTestObject('Object Repository/Page_Download File/a_Download'))

String filePath = RunConfiguration.getProjectDir() + "/Data Files/samplefile.pdf"
File fileDownloaded = new File(filePath)

// Wait until the file exist
int timeout = 60
int elapsedTime = 0
while (!fileDownloaded.exists() && elapsedTime < timeout) {
	WebUI.delay(1)
	elapsedTime++
}

// Verify File is exist then delete it
if (fileDownloaded.exists()) {
	boolean deleted = fileDownloaded.delete()
	if (deleted) {
		WebUI.comment("✅ File is exist and deleted successfully: " + filePath)
	} else {
		WebUI.comment("❌ Failed to delete the file: " + filePath)
	}
} else {
	WebUI.comment("⚠ File not found: " + filePath)
}

WebUI.closeBrowser()
