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

WebUI.navigateToUrl('https://practice.expandtesting.com/secure-password-checker')

WebUI.setText(findTestObject('TC-14/Page_Secure Password Checker page for Automation Testing Practice/input_Password_password'), 
    'Dsil12Dsil')

WebUI.verifyElementNotVisible(findTestObject('TC-14/Page_Secure Password Checker page for Automation Testing Practice/li_Must be at least 8 characters long'))

WebUI.verifyElementNotVisible(findTestObject('TC-14/Page_Secure Password Checker page for Automation Testing Practice/li_Must contain a lowercase letter'))

WebUI.verifyElementNotVisible(findTestObject('TC-14/Page_Secure Password Checker page for Automation Testing Practice/li_Must contain a number or special character'))

WebUI.verifyElementNotVisible(findTestObject('TC-14/Page_Secure Password Checker page for Automation Testing Practice/li_Must contain an uppercase letter'))

WebUI.closeBrowser()

