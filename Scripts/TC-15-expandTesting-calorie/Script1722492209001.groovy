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

WebUI.navigateToUrl('https://practice.expandtesting.com/tracalorie/')

WebUI.setText(findTestObject('Object Repository/TC-15/Page_Tracalorie  Meal  Calorie Tracker Auto_c8671a/input_Meal_item-name'), 
    'Mango')

WebUI.setText(findTestObject('Object Repository/TC-15/Page_Tracalorie  Meal  Calorie Tracker Auto_c8671a/input_Calories_item-calories'), 
    '4')

WebUI.click(findTestObject('Object Repository/TC-15/Page_Tracalorie  Meal  Calorie Tracker Auto_c8671a/button_Add Meal'))

WebUI.setText(findTestObject('Object Repository/TC-15/Page_Tracalorie  Meal  Calorie Tracker Auto_c8671a/input_Meal_item-name'), 
    'Chicken')

WebUI.setText(findTestObject('Object Repository/TC-15/Page_Tracalorie  Meal  Calorie Tracker Auto_c8671a/input_Calories_item-calories'), 
    '24')

WebUI.click(findTestObject('Object Repository/TC-15/Page_Tracalorie  Meal  Calorie Tracker Auto_c8671a/button_Add Meal'))

WebUI.verifyElementText(findTestObject('TC-15/Page_Tracalorie  Meal  Calorie Tracker Automation Testing Practice/span_0'), 
    '28')

WebUI.closeBrowser()

