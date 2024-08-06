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

WebUI.navigateToUrl('https://practice.expandtesting.com/bmi')

WebUI.selectOptionByValue(findTestObject('Object Repository/TC-13/Page_BMI Calculator example page for Automa_921d2f/select_Female            Male'), 
    'Male', true)

WebUI.setText(findTestObject('Object Repository/TC-13/Page_BMI Calculator example page for Automa_921d2f/input_Age (ages 2 - 120)_age'), 
    age)

WebUI.setText(findTestObject('Object Repository/TC-13/Page_BMI Calculator example page for Automa_921d2f/input_Height (cm)_height'), 
    height)

WebUI.setText(findTestObject('Object Repository/TC-13/Page_BMI Calculator example page for Automa_921d2f/input_Weight (kg)_weight'), 
    weight)

WebUI.click(findTestObject('Object Repository/TC-13/Page_BMI Calculator example page for Automa_921d2f/button_Calculate'))

WebUI.verifyElementText(findTestObject('TC-13/Page_BMI Calculator example page for Automation Testing Practice/span_Your Body Fat is 12.4'), 
    ans)

WebUI.closeBrowser()

