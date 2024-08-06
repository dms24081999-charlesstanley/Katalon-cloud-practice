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

WebUI.navigateToUrl('https://phptravels.com/demo/')

WebUI.setText(findTestObject('Object Repository/TC-04/Page_Book Your Free Demo Now - Phptravels/input_Demo Request Form_first_name'), 
    'dom')

WebUI.setText(findTestObject('Object Repository/TC-04/Page_Book Your Free Demo Now - Phptravels/input_First Name_last_name'), 
    'sil')

WebUI.setText(findTestObject('Object Repository/TC-04/Page_Book Your Free Demo Now - Phptravels/input_Select Country_whatsapp'), 
    '9876543210')

WebUI.setText(findTestObject('Object Repository/TC-04/Page_Book Your Free Demo Now - Phptravels/input_Whatsapp Number_business_name'), 
    'Sat')

WebUI.setText(findTestObject('Object Repository/TC-04/Page_Book Your Free Demo Now - Phptravels/input_Business Name_email'), 
    'ds@gmail.com')

WebUI.setText(findTestObject('Object Repository/TC-04/Page_Book Your Free Demo Now - Phptravels/input__number'), '14')

WebUI.click(findTestObject('Object Repository/TC-04/Page_Book Your Free Demo Now - Phptravels/button_Submit'))

WebUI.closeBrowser()

