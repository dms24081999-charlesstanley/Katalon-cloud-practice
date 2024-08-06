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

WebUI.navigateToUrl('https://artoftesting.com/samplesiteforselenium')

WebUI.scrollToElement(findTestObject('Object Repository/TC-50/Page_Sample Webpage for Selenium Automation_95a9a5/input_This is a link_firstName'), 
    0)

WebUI.setText(findTestObject('Object Repository/TC-50/Page_Sample Webpage for Selenium Automation_95a9a5/input_This is a link_firstName'), 
    'Hello')

WebUI.click(findTestObject('Object Repository/TC-50/Page_Sample Webpage for Selenium Automation_95a9a5/form_Male Female'))

WebUI.click(findTestObject('Object Repository/TC-50/Page_Sample Webpage for Selenium Automation_95a9a5/input_MaleFemale_gender'))

WebUI.click(findTestObject('Object Repository/TC-50/Page_Sample Webpage for Selenium Automation_95a9a5/button_Submit'))

WebUI.closeBrowser()

