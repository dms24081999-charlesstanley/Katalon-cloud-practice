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

WebUI.navigateToUrl('https://demo.automationtesting.in/Register.html')

WebUI.setText(findTestObject('Object Repository/TC-03/Page_Register/input_Full Name_form-control ng-pristine ng_10dee7'), 
    'Dom')

WebUI.setText(findTestObject('Object Repository/TC-03/Page_Register/input_Full Name_form-control ng-untouched n_438cb8'), 
    'Sil')

WebUI.setText(findTestObject('Object Repository/TC-03/Page_Register/textarea_Address_form-control ng-untouched _b1abf7'), 
    'Nav CHS')

WebUI.setText(findTestObject('Object Repository/TC-03/Page_Register/input_Email address_form-control ng-untouch_b58296'), 
    'dsil@gmail.com')

WebUI.setText(findTestObject('Object Repository/TC-03/Page_Register/input_Phone_form-control ng-untouched ng-in_c98163'), 
    '9876543210')

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/label_Male'))

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/input_Hobbies_checkbox1'))

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/input_Hobbies_checkbox1'))

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/input_Cricket_checkbox2'))

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/div_Languages_msdd'))

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/div_Languages_msdd'))

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/li_English'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC-03/Page_Register/select_Select Skills                       _fcf818'), 
    'C++', true)

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/span_Select Country_select2-selection selec_6e0c3c'))

WebUI.selectOptionByValue(findTestObject('Object Repository/TC-03/Page_Register/select_year                             191_0e56cb'), 
    year, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC-03/Page_Register/select_Month                               _920c21'), 
    month, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/TC-03/Page_Register/select_Day                                 _6d848d'), 
    date, true)

WebUI.setEncryptedText(findTestObject('Object Repository/TC-03/Page_Register/input_Password_firstpassword'), '3Z9vEXbPUsD5eDQOwLR1+w==')

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/form_Full Name                             _47f0eb'))

WebUI.setEncryptedText(findTestObject('Object Repository/TC-03/Page_Register/input_Confirm Password_secondpassword'), 
    '3Z9vEXbPUsD5eDQOwLR1+w==')

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/button_Submit'))

WebUI.click(findTestObject('Object Repository/TC-03/Page_Register/button_Refresh'))

WebUI.closeBrowser()

