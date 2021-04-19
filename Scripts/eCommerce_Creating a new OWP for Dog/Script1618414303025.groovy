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

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/button_Cookies Settings_onetrust-close-btn-_305671'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h1_Get started with Optimum Wellness Plan o_d134cf'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_No, Im new'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h1_Tell us about your pet'))

WebUI.setText(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_concat(Your pet, , s name)_petName'), 
    'Dog1')

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_concat(Your pet, , s name)_choosepet'))

WebUI.click(findTestObject('eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/span_Select breed'))

WebUI.selectOptionByValue(findTestObject('eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/span_A Mississippi'), 
    'A Mississippi', false)

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Select breed_mixedbreed'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Are they spayed or neutered_sprayedNeutered'))

WebUI.setText(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Date of birth (or best guess)_birthday'), 
    '01/20/2020')

WebUI.selectOptionByValue(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/select_Choose gender                       _3d64df'), 
    'male', true)

WebUI.setText(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Weight (lbs)_petweight'), 
    '20.88')

WebUI.setText(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Color_petcolor'), 
    'White and Brown')

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Next'))

WebUI.setText(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Select another location_wide-search'), 
    '77073')

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_Select another location_fa fa-arrow-right_691248_1'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Creekside_makePreferred1'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Next_1'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h1_Select Dog1s Optimum Wellness Plan'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/p_Unlike insurance, your pets Optimum Welln_af1853'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Dog Active Care'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Dog Active Care Plus'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Dog Special Care'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_31.95mo'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/span_31.95'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_383.40yr'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_(Retail value 843.22yr)'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_42.95mo'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/span_42.95'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_515.40yr'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_(Retail value 1,228.12yr)'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_54.95mo'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/span_54.95'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_659.40yr'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_(Retail value 1,802.12yr)'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_(Retail value yr)_mselectplan1'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/p_A one-time 49.95 set-up fee is due with y_05c780'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h2_OWP comparison chart'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/td_Recommended                             _0da5e9'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Next_1_2'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/h1_Add parasite control and other options'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/p_Add wellness options, at a discount, for _96ec84'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/p_Not sure what you need Dont worry, nothin_5d585b'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/h2_Parasite control'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/p_Prices shown are estimates based on typic_1d38e0'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/td_Flea, Tick  Heartworm Prevention (3 in 1)'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/div_ 24.50 mo'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/span_24.50'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/input_Flea, Tick  Heartworm Prevention (3 i_3d7b99'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/h2_Additional options'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/td_WISDOM PANEL'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/div_ 6.75 mo'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/span_6.75'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/input_WISDOM PANEL_selectparasite3'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Dog Active Care  Salesforce Commerce C_e6583a/a_Next'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h1_Check out your pets Optimum Wellness Plan'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h2_Dog1s Optimum Wellness Plan (OWP)'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Core package'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Dog Active Care'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_31.95mo_1'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/span_31.95'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Custom options'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Flea, Tick  Heartworm Prevention (3 in _30548f'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/span_31.25mo'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_31.25mo'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_12 monthly payments'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Totaling 758.40'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/span_63.20mo'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_63.20mo'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_One-time enrollment fee'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_49.95'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Total due at first visit'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_113.15'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h4_Got a promotion Enter your code below'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Got a promotion Enter your code below_7d7088'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Apply'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h2_Lets get your contact information'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h2_Lets get your contact information'))

WebUI.setText(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_First name_firstname'), 
    'Ramesh')

WebUI.setText(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Last name_lastname'), 
    'Nalla')

WebUI.setText(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Phone_phone'), 
    '9701002688')

WebUI.setText(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Your email_emailaddr'), 
    'rnalla@hgsdigital.com')

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/input_Your email_opt-email'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Next_1_2_3'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h4_Five things to know about Optimum Wellne_8ca52e'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/li_Well need your credit card to start enro_e3631b'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/li_You have 30 days to make your appointmen_151a4e'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/li_The prices shown on this site are estima_e18ea4'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/li_Your pets enrollment is not confirmed un_2db8d6'))

WebUI.click(findTestObject('Object Repository/eCommerce-Phase1/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/li_You must be 18 or older to enroll your p_717f19'))

WebUI.closeBrowser()

