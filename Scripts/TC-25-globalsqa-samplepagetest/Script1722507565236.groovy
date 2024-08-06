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
import package1.sample1 as sample1

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.globalsqa.com/samplepagetest/')

String namedata = sample1.enterdata('name')

WebUI.setText(findTestObject('Object Repository/TC-25/Page_Sample Page Test - GlobalSQA/input_(required)_g2599-name'), namedata)

WebUI.setText(findTestObject('Object Repository/TC-25/Page_Sample Page Test - GlobalSQA/input_(required)_g2599-email'), 
    'sil@as.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC-25/Page_Sample Page Test - GlobalSQA/select_0-11-33-55-77-1010'), 
    '1-3', true)

WebUI.click(findTestObject('Object Repository/TC-25/Page_Sample Page Test - GlobalSQA/input_Automation Testing_g2599-expertise'))

WebUI.click(findTestObject('Object Repository/TC-25/Page_Sample Page Test - GlobalSQA/input_Automation Testing_g2599-expertise'))

WebUI.click(findTestObject('Object Repository/TC-25/Page_Sample Page Test - GlobalSQA/label_Graduate'))

WebUI.click(findTestObject('Object Repository/TC-25/Page_Sample Page Test - GlobalSQA/button_Alert Box  Click Here'))

WebUI.setText(findTestObject('Object Repository/TC-25/Page_Sample Page Test - GlobalSQA/textarea_(required)_g2599-comment'), 
    'hello')

WebUI.click(findTestObject('Object Repository/TC-25/Page_Sample Page Test - GlobalSQA/button_Submit'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

