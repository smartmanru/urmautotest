import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\1q\\AppData\\Local\\Temp\\Katalon\\Test Cases\\create_release_with_lifecycle\\20190402_135424\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: double rel_version

not_run: KeywordLogger log = new KeywordLogger()

not_run: WebUI.openBrowser('https://urm.space/urmweb/system/login')

not_run: WebUI.waitForElementClickable(findTestObject('Login/login'), 10)

not_run: WebUI.setText(findTestObject('Login/login'), 'man')

not_run: WebUI.setEncryptedText(findTestObject('Login/password'), 'cspISQ8CZDY=')

not_run: WebUI.click(findTestObject('Login/button_login'))

not_run: WebUI.waitForElementVisible(findTestObject('online-ROOK'), 5)

not_run: WebUI.navigateToUrl('https://urm.space/urmweb/user/releases/context/app/mysystem/demo69/view/create')

not_run: WebUI.click(findTestObject('Object Repository/release/button_create_release'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/release/enum_release_lifecycle'), '1', true)

not_run: WebUI.delay(5)

rel_version = WebUI.executeJavaScript('(return (document.evaluate("//*/input[@testid=\\'urm-createversion-field\\']", document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue).value)', 
    null)

log.logWarning('The value is:=' + rel_version)

not_run: WebUI.click(findTestObject('Object Repository/release/ex_button_create_rel'))

not_run: WebUI.navigateToUrl(('https://urm.space/urmweb/user/releases/context/app/mysystem/demo69/view/release/' + rel_version) + 
    '/schedule')

not_run: WebUI.delay(15)

not_run: WebUI.navigateToUrl(('https://urm.space/urmweb/user/releases/context/app/mysystem/demo69/view/release/' + rel_version) + 
    '/drop')

not_run: WebUI.click(findTestObject('Object Repository/release/table_buttom_del_release'))

not_run: WebUI.click(findTestObject('Object Repository/release/checkbox'))

not_run: WebUI.click(findTestObject('Object Repository/release/urm-execute-button'))

''', 'Test Cases/create_release_with_lifecycle', new TestCaseBinding('Test Cases/create_release_with_lifecycle',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
