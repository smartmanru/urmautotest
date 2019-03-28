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


RunConfiguration.setExecutionSettingFile('C:\\Users\\1q\\AppData\\Local\\Temp\\Katalon\\Test Cases\\test2_revision\\20190328_132420\\execution.properties')

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

not_run: WebUI.waitForElementClickable(findTestObject('1_test/login/login'), 5)

not_run: WebUI.setText(findTestObject('Object Repository/1_test/login/login'), 'man')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/1_test/login/password'), 'cspISQ8CZDY=')

not_run: WebUI.click(findTestObject('Object Repository/1_test/login/button_login'))

not_run: WebUI.waitForElementVisible(findTestObject('online-ROOK'), 5)

not_run: WebUI.navigateToUrl('https://urm.space/urmweb/user/configuration/context/app/mysystem/Regression_test/view/revisions')

WebUI.click(findTestObject('1_test/CONF/IS/PROD/REV/table_fix_rev'))

WebUI.click(findTestObject('1_test/CONF/IS/PROD/REV/table_create_revision'))

WebUI.setText(findTestObject('input_code'), 'var')

WebUI.setText(findTestObject('input_name'), 'var')

WebUI.click(findTestObject('1_test/CONF/IS/PROD/REV/ex_create_rev'))

''', 'Test Cases/test2_revision', new TestCaseBinding('Test Cases/test2_revision',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
