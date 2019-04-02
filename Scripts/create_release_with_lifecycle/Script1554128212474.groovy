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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.openBrowser('https://urm.space/urmweb/system/login')

WebUI.waitForElementClickable(findTestObject('Login/login'), 10)

WebUI.setText(findTestObject('Login/login'), 'man')

WebUI.setEncryptedText(findTestObject('Login/password'), 'cspISQ8CZDY=')

WebUI.click(findTestObject('Login/button_login'))

WebUI.waitForElementVisible(findTestObject('online-ROOK'), 5)

WebUI.navigateToUrl('https://urm.space/urmweb/user/releases/context/app/mysystem/demo69/view/create')

WebUI.click(findTestObject('Object Repository/release/button_create_release'))

WebUI.selectOptionByValue(findTestObject('Object Repository/release/enum_release_lifecycle'), '1', true)

WebUI.delay(5)

'javascript search Xpath and extract value \r\n\r\n'
rel_version = WebUI.executeJavaScript('return(document.evaluate("//*/input[@testid=\'urm-createversion-field\']", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue).value', 
    [])

log.logWarning('The value is:=' + rel_version)

WebUI.click(findTestObject('Object Repository/release/ex_button_create_rel'))

WebUI.navigateToUrl(('https://urm.space/urmweb/user/releases/context/app/mysystem/demo69/view/release/' + rel_version) + 
    '/schedule')

WebUI.navigateToUrl(('https://urm.space/urmweb/user/releases/context/app/mysystem/demo69/view/release/' + rel_version) + 
    '/drop')

WebUI.click(findTestObject('Object Repository/release/table_buttom_del_release'))

WebUI.click(findTestObject('Object Repository/release/checkbox'))

WebUI.click(findTestObject('Object Repository/release/urm-execute-button'))

