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

WebUI.navigateToUrl('https://sfcc-uat.banfield.com/')

//WebUI.navigateToUrl('https://sfcc-uat.banfield.com/pet?addpet=guest')
WebUI.maximizeWindow()

WebUI.click(findTestObject('OWP_Dog/button_Cookies Settings_onetrust-close-btn-_305671'))

WebUI.verifyElementPresent(findTestObject('OWP_Dog/No, I am new_Button'), 20)

WebUI.click(findTestObject('OWP_Dog/No, I am new_Button'))

WebUI.verifyElementPresent(findTestObject('OWP_Dog/Title_Pet details page'), 20)

WebUI.setText(findTestObject('OWP_Dog/input_concat(Your pet, , s name)_petName'), 'Test pet')

WebUI.click(findTestObject('OWP_Dog/input_concat(Your pet, , s name)_choosepet'))

WebUI.click(findTestObject('OWP_Dog/span_Select breed'))

WebUI.setText(findTestObject('OWP_Dog/input_Cookies Settings_select2-search__field'), 'Unknown Canine')

WebUI.sendKeys(findTestObject('OWP_Dog/input_Cookies Settings_select2-search__field'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('OWP_Dog/input_Select breed_mixedbreed'))

WebUI.click(findTestObject('OWP_Dog/input_Are they spayed or neutered_sprayedNeutered'))

WebUI.selectOptionByValue(findTestObject('OWP_Dog/select_Choose gender                       _3d64df'), 'male', true)

WebUI.setText(findTestObject('OWP_Dog/input_Date of birth (or best guess)_birthday'), '02/01/2020')

WebUI.click(findTestObject('OWP_Dog/Enter Color'))

WebUI.setText(findTestObject('OWP_Dog/Enter Pet Weight'), '10')

WebUI.setText(findTestObject('OWP_Dog/Enter Color'), 'White')

WebUI.click(findTestObject('OWP_Dog/Next button_On enter new Pet details page'))

WebUI.waitForElementVisible(findTestObject('OWP_Dog/Title_Location Page'), 20)

LocationPageURL = WebUI.getUrl()

System.out.println(LocationPageURL)

//WebUI.scrollToPosition(9999999, 9999999)
WebUI.scrollToPosition(1354, 133)

WebUI.verifyElementVisibleInViewport(findTestObject('OWP_Dog/Zipcode_Search Box'), 10)

WebUI.setText(findTestObject('OWP_Dog/Zipcode_Search Box'), '77073')

WebUI.sendKeys(findTestObject('OWP_Dog/Zipcode_Search Box'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('OWP_Dog/Select_Location_Check-Box'), 20)

//WebUI.focus(findTestObject('OWP_Dog/Select_Location_Check-Box'))
//WebUI.enhancedClick(findTestObject('OWP_Dog/Select_Location_Check-Box'))
CustomKeywords.'banfield_eCommerce_Phase1.clickElement.clickUsingJS'(findTestObject('OWP_Dog/Select_Location_Check-Box'), 
    30)

WebUI.verifyElementPresent(findTestObject('OWP_Dog/Next button_Location Page'), 20)

WebUI.verifyElementPresent(findTestObject('OWP_Dog/Back button_Location Page'), 20)

WebUI.focus(findTestObject('OWP_Dog/Next button_Location Page'))

WebUI.click(findTestObject('OWP_Dog/Next button_Location Page'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('OWP_Dog/Text under Title_Select a Plan'), 20)

SelectPlanPageURL = WebUI.getUrl()

WebUI.verifyElementPresent(findTestObject('OWP_Dog/Title_Select a Plan Page'), 10)

WebUI.verifyElementText(findTestObject('OWP_Dog/Text under Title_Select a Plan'), 'Unlike insurance, your pet’s Optimum Wellness Plan (OWP) is a smart and affordable yearly package of preventive petcare services. Pay monthly, or yearly, with no interest charges.')

