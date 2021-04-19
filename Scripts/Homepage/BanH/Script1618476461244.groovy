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
import com.kms.katalon.core.testobject.TestObjectXpath as TestObjectXpath
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sfcc-uat.banfield.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/button_Cookies Settings_onetrust-close-btn-_305671'))

WebUI.verifyElementText(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/li_Sign in'), 
    'Sign in', FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h1_Lets get started'))

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_No, Im new'))

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Enrollment_nav-link inactive active'))

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Enrollment_nav-link inactive'))

Head = 'Tell us about your pet.'

WebUI.verifyElementText(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h1_Tell us about your pet'), 
    Head)

WebUI.setText(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_concat(Your pet, , s name)_petName'), 
    'Puppy')

Text = 'Do they wag, or purr?'

Text1 = WebUI.getText(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/p_Do they wag, or purr'))

WebUI.verifyElementText(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/p_Do they wag, or purr'), 
    Text)

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_concat(Your pet, , s name)_choosepet'))

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/span_Select breed'))

WebUI.click(findTestObject('BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Breed Option'))

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/label_Mixed breed'))

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/label_Yes'))

WebUI.setText(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Date of birth (or best guess)_birthday'), 
    '02/14/2001')

WebUI.selectOptionByValue(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/select_Choose gender                       _3d64df'), 
    'male', true)

WebUI.setText(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Weight (lbs)_petweight'), 
    '176')

WebUI.setText(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Color_petcolor'), 
    'Orange')

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Next'))

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Enrollment_nav-link inactive active_1'))

WebUI.click(findTestObject('Object Repository/BanH/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Enrollment_nav-link inactive_1'))

WebUI.closeBrowser()

