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

WebUI.navigateToUrl('https://practice.expandtesting.com/forgot-password')

WebUI.scrollToElement(findTestObject('Object Repository/TC-45/Page_Forgot Password form page for Automati_35a731/input_E-mail_email'), 
    0)

WebUI.setText(findTestObject('Object Repository/TC-45/Page_Forgot Password form page for Automati_35a731/input_E-mail_email'), 
    'dom@gmail.com')

WebUI.click(findTestObject('Object Repository/TC-45/Page_Forgot Password form page for Automati_35a731/button_Retrieve password'))

WebUI.verifyElementPresent(findTestObject('Object Repository/TC-45/Page_Email sent notifications page for Auto_dac04c/div_An e-mail has been sent to you which ex_5170f4'), 
    0)

WebUI.closeBrowser()

