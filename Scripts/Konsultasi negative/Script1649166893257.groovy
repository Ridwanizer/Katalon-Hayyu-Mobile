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

'Tap Bayar'
Mobile.tap(findTestObject('Checkout/android.view.View - Bayar Sekarang'), 2)

'Wait/Delay'
Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Get Y Value'
int startY2 = 2167

'Get X Value'
int startX2 = 910

'Tap Lanjutkan'
Mobile.tapAtPosition(startX2, startY2)

'Wait/Delay'
Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

//=============================   BCA  ====================
'Get Y Value'
int startY7 = 717

'Get Y Value'
int startX7 = 115

'Tap BCA Klik Pay'
Mobile.tapAtPosition(startX7, startY7)

//=============================   END BCA  ====================
'Wait/Delay'
Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

//=============================
'Get Y Value'
int startY6 = 170

'Get X Value'
int startX6 = 70

'Bayar'
Mobile.tapAtPosition(startX6, startY6)

'Wait/Delay'
Mobile.delay(10, FailureHandling.CONTINUE_ON_FAILURE)

//=============================   KLIK Bayar Sekarang  ====================
'Get Y Value'
int startY3 = 2167

'Get Y Value'
int startX3 = 910

'Tap Bayar Sekarang'
Mobile.tapAtPosition(startX3, startY3)

//=============================   END KLIK Bayar Sekarang ====================
'Wait/Delay'
Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

'Verify'
Mobile.verifyElementVisible(findTestObject('Konsultasi/android.widget.Image - Midtrans'), 5, false)

//=============================   DESCRIPTION BAYAR  ====================
'Get Y Value'
int startY4 = 1500

'Get X Value'
int startX4 = 150

'Bayar'
Mobile.tapAtPosition(startX4, startY4)

//=============================   END DESCRIPTION BAYAR  ====================
'Get Y Value'
int startY5 = 930

'Get X Value'
int startX5 = 335

'Back to Merchant'
Mobile.tapAtPosition(startX5, startY5)

//=============================
'Verify'
Mobile.tap(findTestObject('Konsultasi/android.view.View - Kembali'), 5)

