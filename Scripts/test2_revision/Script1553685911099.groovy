import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://urm.space/urmweb/system/login')

WebUI.waitForElementClickable(findTestObject('1_test/login/login'), 5)

WebUI.setText(findTestObject('Object Repository/1_test/login/login'), 'man')

WebUI.setEncryptedText(findTestObject('Object Repository/1_test/login/password'), 'cspISQ8CZDY=')

WebUI.click(findTestObject('Object Repository/1_test/login/button_login'))

WebUI.waitForElementVisible(findTestObject('online-ROOK'), 5)

WebUI.navigateToUrl('https://urm.space/urmweb/user/configuration/context/app/mysystem/Regression_test/view/revisions')

WebUI.click(findTestObject('1_test/CONF/IS/PROD/REV/table_create_revision'))

WebUI.setText(findTestObject('input_code'), 'var')

WebUI.setText(findTestObject('input_name'), 'var')

WebUI.click(findTestObject('1_test/CONF/IS/PROD/REV/ex_create_rev'))

