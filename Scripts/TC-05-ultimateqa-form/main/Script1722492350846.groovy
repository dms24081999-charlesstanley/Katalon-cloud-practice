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

WebUI.navigateToUrl('https://ultimateqa.com/filling-out-forms/')

WebUI.setText(findTestObject('Object Repository/TC-05/Page_Filling Out Forms - Ultimate QA/input_Name_et_pb_contact_name_0'), 
    'Jam')

WebUI.setText(findTestObject('Object Repository/TC-05/Page_Filling Out Forms - Ultimate QA/textarea_Message_et_pb_contact_message_0'), 
    'Butter')

WebUI.setText(findTestObject('Object Repository/TC-05/Page_Filling Out Forms - Ultimate QA/input_Name_et_pb_contact_name_1'), 
    'Sam')

WebUI.setText(findTestObject('Object Repository/TC-05/Page_Filling Out Forms - Ultimate QA/textarea_Message_et_pb_contact_message_1'), 
    'Gutt')

WebUI.click(findTestObject('Object Repository/TC-05/Page_Filling Out Forms - Ultimate QA/button_Submit'))

WebUI.closeBrowser()

