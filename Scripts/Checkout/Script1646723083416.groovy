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

Mobile.startApplication('D:\\Katalon Studio Project\\Test Mobile\\hayyu_04-04-2022.apk', false)

'Tap Basket'
Mobile.tap(findTestObject('Object Repository/Checkout/android.widget.ImageView - Keranjang'), 0)

'Wait/Delay'
Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Get Y Value'
int startY0 = 1000

'Get X Value'
int startX0 = 112

'Tap product choice'
Mobile.tapAtPosition(startX0, startY0)

'Wait/Delay'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Get Y Value'
int startY1 = 1327

'Get X Value'
int startX1 = 950

'Tap +'
Mobile.tapAtPosition(startX1, startY1)

'Wait/Delay'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'MENGATUR TAP TAMBAH MODAL'
int startY11 = 1351

'Get X Value'
int startX11 = 600

'Tap +'
Mobile.tapAtPosition(startX11, startY11)

'Wait/Delay'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

//=============================   MODAL  ====================
//Dari 2 ke dst
'MENGATUR TAP TAMBAH MODAL'
int startY111 = 1351

'Get X Value'
int startX111 = 645

'Tap +'
Mobile.tapAtPosition(startX111, startY111)

'Wait/Delay'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap +'
Mobile.tapAtPosition(startX111, startY111)

'Wait/Delay'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'Tap Option Ubah'
Mobile.tap(findTestObject('Checkout/android.widget.Button -Ubah'), 2)

'Wait/Delay'
Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Tap Checkout'
Mobile.tap(findTestObject('Checkout/android.view.View - Checkout Sekarang'), 2)

'Wait/Delay'
Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

//'Tap Jasa Pengiriman'
//Mobile.tap(findTestObject('Checkout/android.view.View - Jasa Pengiriman'), 2)
//
//'Tap JNT Ekspedisi'
//Mobile.tap(findTestObject('Checkout/android.view.View - JNT'), 2)
//Mobile.tap(findTestObject('Checkout/android.view.View - Gunakan Voucher'), 2)
//
//Mobile.tap(findTestObject('Checkout/android.widget.ImageView - Voucher ongkir'), 2)
//
//Mobile.tap(findTestObject('Checkout/android.view.View - Gunakan'), 2)
'Get Y Value'
int startY = 1900

'Get Y Value'
int endY = 500

'Get X Value'
int startX = 500

'Get X Value'
int endX = 500

'Swipe'
Mobile.swipe(startX, startY, endX, endY)

//Mobile.tap(findTestObject('Checkout/android.widget.Switch - point checkout'), 2)

'Tap Bayar'
Mobile.tap(findTestObject('Checkout/android.view.View - Bayar Sekarang'), 2)

'Wait/Delay'
Mobile.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Verify Alert'
Mobile.verifyElementNotVisible(findTestObject('Checkout/android.view.View Alert Massage'), 5, FailureHandling.STOP_ON_FAILURE)

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

//=============================   DESCRIPTION BAYAR  ====================
'Get Y Value'
int startY4 = 1500

'Get X Value'
int startX4 = 150

'Bayar'
Mobile.tapAtPosition(startX4, startY4)

'Wait/Delay'
Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

//=============================   END DESCRIPTION BAYAR  ====================
'Get Y Value'
int startY5 = 930

'Get X Value'
int startX5 = 335

'Back to Merchant'
Mobile.tapAtPosition(startX5, startY5)

//=============================
'Wait/Delay'
Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

'Verify'
Mobile.verifyElementVisible(findTestObject('Checkout/android.view.View Kembalii'), 2)

