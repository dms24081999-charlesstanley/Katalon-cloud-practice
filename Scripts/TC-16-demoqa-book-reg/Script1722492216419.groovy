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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/register')

WebUI.scrollToElement(findTestObject('Object Repository/TC-16/Page_DEMOQA/input_First Name_firstname'), 0)

WebUI.setText(findTestObject('Object Repository/TC-16/Page_DEMOQA/input_First Name_firstname'), 'dom')

WebUI.setText(findTestObject('Object Repository/TC-16/Page_DEMOQA/input_Last Name_lastname'), 'sil')

WebUI.setText(findTestObject('Object Repository/TC-16/Page_DEMOQA/input_UserName_userName'), 'dms')

WebUI.setEncryptedText(findTestObject('Object Repository/TC-16/Page_DEMOQA/input_Password_password'), 'Y/eEA/RfZxHQ4UDkleMkig==')

WebUI.click(findTestObject('Object Repository/TC-16/Page_DEMOQA/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/TC-16/Page_DEMOQA/button_Register'))

WebUI.verifyElementText(findTestObject('TC-16/Page_DEMOQA/p_Passwords must have at least one non alphanumeric character, one digit (0-9), one uppercase (A-Z), one lowercase (a-z), one special character and Password must be eight characters or longer'), 
    error)

WebUI.closeBrowser()

