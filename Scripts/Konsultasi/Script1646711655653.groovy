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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode

Mobile.startApplication('D:\\Katalon Studio Project\\Test Mobile\\hayyu_04-04-2022.apk', false)

'Tap Menu Konsultasi'
Mobile.tap(findTestObject('Object Repository/Konsultasi/android.widget.ImageView -Konsultasi'), 0)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Get Y Value'
int startY1 = 500

'Get X Value'
int startX1 = 700

'Tap coordinate'
Mobile.tapAtPosition(startX1, startY1)

'Switch use Point'
Mobile.tap(findTestObject('Object Repository/Konsultasi/android.widget.Switch - Radio Button'), 2)

'Tap Buy'
Mobile.tap(findTestObject('Object Repository/Konsultasi/android.view.View -Bayar'), 5)

'Wait/Delay'
Mobile.waitForElementPresent(findTestObject('Konsultasi/android.widget.ImageView -Konsultasi'), 5)

'Get Y Value'
int startY2 = 1588

'Get X Value'
int startX2 = 518

'Tap Back'
Mobile.tapAtPosition(startX2, startY2)

'Verify Konsultasi done order'
Mobile.verifyElementVisible(findTestObject('Konsultasi/android.view.View transaksi berlangsung'), 5)

'Get Y Value'
int startY3 = 735

'Get X Value'
int startX3 = 835

'Action Konsultasi Doctor'
Mobile.tapAtPosition(startX3, startY3)

'Wait/Delay'
Mobile.delay(5)

'Tap Chat with Doctor'
Mobile.tap(findTestObject('Konsultasi/android.widget.Button Chat Dokter'), 2)

'Verify Chat'
Mobile.verifyElementVisible(findTestObject('Konsultasi/android.widget.ImageView Dr Syaima'), 0)

'Send Massage'
Mobile.setText(findTestObject('Konsultasi/android.widget.EditText - Message'), 'Hallo doc, Mau tanya dong', 0, FailureHandling.STOP_ON_FAILURE)

'Tap Send Chat'
Mobile.tap(findTestObject('Konsultasi/android.widget.Button - Kirim'), 15)

'Wait/Delay'
Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

