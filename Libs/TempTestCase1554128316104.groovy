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


RunConfiguration.setExecutionSettingFile('C:\\Users\\1q\\AppData\\Local\\Temp\\Katalon\\Test Cases\\create_release_with_lifecycle\\20190401_171836\\execution.properties')

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

not_run: WebUI.openBrowser('https://urm.space/urmweb/system/login')

not_run: WebUI.waitForElementClickable(findTestObject('1_test/login/login'), 10)

WebUI.setText(findTestObject('Object Repository/1_test/login/login'), 'man')

WebUI.setEncryptedText(findTestObject('Object Repository/1_test/login/password'), 'cspISQ8CZDY=')

WebUI.click(findTestObject('Object Repository/1_test/login/button_login'))

WebUI.waitForElementVisible(findTestObject('online-ROOK'), 5)

WebUI.navigateToUrl('https://urm.space/urmweb/user/releases/context/app/mysystem/demo69/view/create')

WebUI.click(findTestObject('Object Repository/release/button_create_release'))

WebUI.selectOptionByValue(findTestObject('Object Repository/release/enum_release_lifecycle'), '1', true)

WebUI.getText(findTestObject('Object Repository/release/create_release_version'))

WebUI.click(findTestObject('Object Repository/release/ex_button_create_rel'))

WebUI.click(findTestObject('Object Repository/release/version_operation'))

WebUI.click(findTestObject('Object Repository/release/version_rel_table'))

WebUI.click(findTestObject('Object Repository/release/rel_lifecycle_menu'))

WebUI.click(findTestObject('Object Repository/release/release_menu'))

WebUI.click(findTestObject('Object Repository/release/menu_delete_rel'))

WebUI.click(findTestObject('Object Repository/release/table_buttom_del_release'))

WebUI.click(findTestObject('Object Repository/release/checkbox'))

WebUI.click(findTestObject('Object Repository/release/urm-execute-button'))

''', 'Test Cases/create_release_with_lifecycle', new TestCaseBinding('Test Cases/create_release_with_lifecycle',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
