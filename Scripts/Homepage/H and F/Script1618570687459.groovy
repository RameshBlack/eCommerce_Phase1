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

WebUI.maximizeWindow()

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Locations'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Wellness packages'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_New to Banfield'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/img'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_New to Banfield_fa fa-plus cursor-pointer'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Optimum Wellness PlansOptimum Wellness _fe8000'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Wellness at BanfieldWellnessDental care_588aa7'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_New to Banfield_fa fa-plus cursor-pointer'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Wellness at BanfieldWellnessDental care_588aa7'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_New to Banfield_fa fa-plus cursor-pointer'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_MyBanfieldLog in  register'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_New to Banfield_fa fa-plus cursor-pointer'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Our locationsLocation searchMake an app_cd4a06'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_Log in  register_fa cursor-pointer fa-times'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_Close_fa fa-times'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/button_Cookies Settings_onetrust-close-btn-_305671'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Visit Banfield'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Banfield Pet Hospital'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Products and services'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Connect with Banfield'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Health and wellness information'))

WebUI.scrollToElement(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Visit Banfield'), 
    0)

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_More from Banfield'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_Careers_fa fa-facebook'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_Facebook_fa fa-twitter'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_Twitter_fa fa-instagram'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/i_Instagram_fa fa-youtube-play'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/img_1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Privacy'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Cookie notice'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Cookie settings'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h3_Strictly Necessary Cookies'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/h3_Performance Cookies'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Functional Cookies'))

WebUI.click(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Targeting Cookies'))

WebUI.click(findTestObject('Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Close'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Terms'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_AdChoices'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Accessibility'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_MARS'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Labor conditions applications'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Contact us'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Site map'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/a_Download mobile app'))

End = WebUI.getText(findTestObject('Object Repository/Ban H and F/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/Page_Sites-Banfield-Site  Salesforce Commer_5ad9b9/div_Banfield Pet Hospital, an Affiliate ofM_3d364c'))
println(End)
/*Footer = "Banfield Pet Hospital, an Affiliate of Mars, Incorporated \
Copyright ©2021 Banfield Pet Hospital"



WebUI.verifyMatch(End, Footer, false)
*/
WebUI.closeBrowser()

