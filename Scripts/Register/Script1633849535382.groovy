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

import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
datalogin = findTestData('Register')

for (def i : 1) {
	WebUI.openBrowser('')

	WebUI.navigateToUrl('http://automationpractice.com/index.php')

	WebUI.maximizeWindow()

	WebDriver driver = DriverFactory.getWebDriver()

	dataregister = findTestData('Register')

	username = dataregister.getValue('email', i)

	password = dataregister.getValue('password', i)
	firstname = dataregister.getValue('firstname', i)
	lastname = dataregister.getValue('lastname', i)
	
	company = dataregister.getValue('company', i)
	
	address = dataregister.getValue('address', i)
	
	postcode = dataregister.getValue('postcode', i)
	
	city = dataregister.getValue('city', i)
	additionalinfo = dataregister.getValue('additionalinfo', i)
	number = dataregister.getValue('number', i)
	phonenumber = dataregister.getValue('phonenumber', i)
	
	WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

	
	
	
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), username)
	
	WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))
	
	WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'))
	
	WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr_id_gender'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), firstname)
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), lastname)
	
	WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input__email'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), password)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'),
		'16', true)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'),
		'11', true)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'),
		'1996', true)
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), company)
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), address)
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), city)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'),
		'1', true)
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), postcode)
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/textarea_Additional information_other'), additionalinfo)
	
	WebUI.click(findTestObject('Object Repository/Page_Login - My Store/p_Additional information'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'), number)
	
	WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), phonenumber)
	
	WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))
	
}