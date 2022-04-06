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

'Start Aplikasi'
Mobile.startApplication('D:\\Katalon Studio Project\\Test Mobile\\hayyu.apk', false)

'Wait for Page Load '
Mobile.waitForElementPresent(findTestObject('Beranda/android.view.View - Utama'), 5)

'Click button Sidebar'
Mobile.tap(findTestObject('Beranda/android.widget.Button (Button Sidebar)'), 2)

'Click and Hold name in Sidebar'
Mobile.tapAndHold(findTestObject('Side Bar/android.widget.ImageView - To Profil'), 2, 3)

'Wait'
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Get Y value'
int startY0 = 360

'Get X value'
int startX0 = 630

'Tap Position X and Y'
Mobile.tapAtPosition(startX0, startY0)

'Tap icon camera'
Mobile.tap(findTestObject('Upload Gambar/android.view.View - Icon Camera'), 2)

'Pilih option Camera'
Mobile.tap(findTestObject('Upload Gambar/android.widget.Button - Camera'), 2)

'Tap Shutter'
Mobile.tap(findTestObject('Upload Gambar/android.view.View - Shutter'), 5)

'Accept Image'
Mobile.tap(findTestObject('Upload Gambar/android.widget.ImageView - Done Camera'), 2)

//'Tap option galery'
//Mobile.tap(findTestObject('Upload Gambar/android.widget.Button - Galery'), 2)
//
////
//'Tap Image galery'
//Mobile.tap(findTestObject('Upload Gambar/android.widget.ImageView - Pilih Gambar'), 2)
//
'Accept Edit Image'
Mobile.tap(findTestObject('Upload Gambar/android.widget.TextView - Ok Gambar'), 2)

'Wait/Delay'
Mobile.waitForElementPresent(findTestObject('Profil/android.view.View (4)'), 5)

'Tap field name'
Mobile.tap(findTestObject('Profil/android.widget.EditText - Nama'), 2)

'Get Y value'
int startY1 = 1080

'Get X value'
int startX1 = 957

'Tap and Hold field name'
Mobile.tapAndHoldAtPosition(startX1, startY1, 4, FailureHandling.STOP_ON_FAILURE)

'Tap Sellect All'
Mobile.tap(findTestObject('Profil/android.widget.Button (3)'), 2)

'initialization keyboard'
AndroidDriver<?> driver = MobileDriverFactory.getDriver()

'push keyword backspace'
driver.pressKeyCode(AndroidKeyCode.BACKSPACE)

'Set name'
Mobile.setText(findTestObject('Profil/android.widget.EditText - Nama'), '', 5, FailureHandling.STOP_ON_FAILURE)

'Push keyword enter'
driver.pressKeyCode(AndroidKeyCode.ENTER)

'Wait/Delay'
Mobile.delay(3)

'Tap kelamin'
Mobile.tap(findTestObject('Object Repository/Profil/android.widget.Button'), 2)

'Field tempat tanggal lahir'
Mobile.tap(findTestObject('Object Repository/Profil/android.widget.EditText - Malang'), 0)

'Field tanggal lahir'
Mobile.tap(findTestObject('Upload Gambar/android.view.View tahun'), 0)

'Wait/Delay'
Mobile.delay(1)

'Set Tahun Lahir'
Mobile.tap(findTestObject('Profil/android.widget.Button - Pilih Tahun'), 3)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Device Width and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Get Start Y Value'
int startY = 1100

'Get End Y Value'
int endY = 1300

'Get Start X Value'
int startX = 400

'Get end X Value'
int endX = 400

'Scroll Position'
Mobile.swipe(startX, startY, endX, endY)

'Tap set years'
Mobile.tap(findTestObject('Object Repository/Profil/android.view.View (2)'), 3)

'Tap set date'
Mobile.tap(findTestObject('Profil/android.view.View tanggal 2'), 0)

'Tap set ok'
Mobile.tap(findTestObject('Object Repository/Profil/android.widget.Button (2)'), 0)

'Wait/Delay'
Mobile.waitForElementPresent(findTestObject('Profil/android.view.View (4)'), 5)

'Save'
Mobile.tap(findTestObject('Object Repository/Profil/android.view.View (4)'), 5)

'Verify'
Mobile.verifyElementVisible(findTestObject('Profil/android.view.View Profile'), 10)

Mobile.delay(10)

