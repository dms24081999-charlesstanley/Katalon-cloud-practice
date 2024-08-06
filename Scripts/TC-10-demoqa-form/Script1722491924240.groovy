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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Object Repository/TC-10/Page_DEMOQA/input_Name_firstName'), 'dom')

WebUI.setText(findTestObject('Object Repository/TC-10/Page_DEMOQA/input_Email_userEmail'), 'dom@g.com')

WebUI.setText(findTestObject('Object Repository/TC-10/Page_DEMOQA/input_Name_lastName'), 'sil')

WebUI.click(findTestObject('Object Repository/TC-10/Page_DEMOQA/label_Male'))

WebUI.setText(findTestObject('Object Repository/TC-10/Page_DEMOQA/input_(10 Digits)_userNumber'), '9876543210')

WebUI.setText(findTestObject('Object Repository/TC-10/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'), '29 Jul 2004')

WebUI.click(findTestObject('Object Repository/TC-10/Page_DEMOQA/label_Sports'))

WebUI.click(findTestObject('Object Repository/TC-10/Page_DEMOQA/button_Submit'))

WebUI.click(findTestObject('Object Repository/TC-10/Page_DEMOQA/div_Thanks for submitting the form'))

WebUI.closeBrowser()

