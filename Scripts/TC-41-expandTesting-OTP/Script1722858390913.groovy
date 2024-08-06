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

WebUI.navigateToUrl('https://practice.expandtesting.com/otp-login')

WebUI.scrollToElement(findTestObject('Object Repository/TC-41/Page_OTP Login page for Automation Testing _8094bc/input_Your Email Address_email'), 
    0)

WebUI.setText(findTestObject('Object Repository/TC-41/Page_OTP Login page for Automation Testing _8094bc/input_Your Email Address_email'), 
    'practice@expandtesting.com')

WebUI.click(findTestObject('Object Repository/TC-41/Page_OTP Login page for Automation Testing _8094bc/button_Send OTP                            _7d851b'))

WebUI.scrollToElement(findTestObject('Object Repository/TC-41/Page_OTP Verification page for Automation T_38e666/input_practiceexpandtesting.com_otp'), 
    0)

WebUI.setText(findTestObject('Object Repository/TC-41/Page_OTP Verification page for Automation T_38e666/input_practiceexpandtesting.com_otp'), 
    '214365')

WebUI.click(findTestObject('Object Repository/TC-41/Page_OTP Verification page for Automation T_38e666/button_Verify                              _3f4669'))

WebUI.closeBrowser()

