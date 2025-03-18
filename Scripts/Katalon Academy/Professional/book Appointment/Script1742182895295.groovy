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

username = findTestData('InternalData').getValue('username', 1)

password = GlobalVariable.PASSWORD

user = 'asa'

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.URL)

CustomKeywords.'examples.MyKeyword.Login'(username, password)

for (def index : (0..2)) {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Facility'), 
        'Tokyo CURA Healthcare Center', true)

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/checkbox_Apply for hospital readmission'))

    if (index == 0) {
        WebUI.scrollToElement(findTestObject('Page_CURA Healthcare Service/rb_Medicare'), 0)

        WebUI.click(findTestObject('Page_CURA Healthcare Service/rb_Medicare'))
    } else if (index == 1) {
        WebUI.scrollToElement(findTestObject('Page_CURA Healthcare Service/rb_Medicaid'), 0)

        WebUI.click(findTestObject('Page_CURA Healthcare Service/rb_Medicaid'))
    } else {
        WebUI.scrollToElement(findTestObject('Page_CURA Healthcare Service/rb_None'), 0)

        WebUI.click(findTestObject('Page_CURA Healthcare Service/rb_None'))
    }
    
    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date'))

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Visit Date'))

    WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment'), 'comment')

    WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/btn_Book Appointment'))

    WebUI.click(findTestObject('Page_CURA Healthcare Service/btn_Go to Homepage'))
}

CustomKeywords.'examples.MyKeyword.Conrats'(user)

WebUI.closeBrowser()

