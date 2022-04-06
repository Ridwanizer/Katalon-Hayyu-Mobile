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

'Tap Sidebar\r\n'
Mobile.tap(findTestObject('Beranda/android.widget.Button (Button Sidebar)'), 2)

'Click and Hold name in Sidebar'
Mobile.tapAndHold(findTestObject('Side Bar/android.widget.ImageView - To Profil'), 2, 3)

'Tap Alamat Pengiriman'
Mobile.tap(findTestObject('Object Repository/android.widget.ImageView (1)'), 2)

'Tap +'
Mobile.tap(findTestObject('Object Repository/android.widget.Button (1)'), 2)

'Tap Field simpan sebagai'
Mobile.tap(findTestObject('Object Repository/android.widget.EditText - contoh Rumah, Kantor, dll'), 2)

'Set text in field simpan sebagai\r\n'
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - contoh Rumah, Kantor, dll'), 'Home Katalon', 
    0, FailureHandling.STOP_ON_FAILURE)

'Tap field alamat'
Mobile.tap(findTestObject('Alamat/android.widget.EditText'), 0)

'Set text in field alamat\r\n'
Mobile.setText(findTestObject('Alamat/android.widget.EditText'), 'Jl. Patimura', 2)

'Dropdown Prov'
Mobile.tap(findTestObject('Object Repository/android.view.View'), 2)

'Get Prov'
Mobile.tap(findTestObject('Object Repository/android.view.View (1)'), 2)

'Dropdown Kab'
Mobile.tap(findTestObject('Object Repository/android.view.View (2)'), 2)

'Get Kab'
Mobile.tap(findTestObject('Object Repository/android.view.View (3)'), 2)

'Dropdown Kec'
Mobile.tap(findTestObject('Object Repository/android.view.View (4)'), 2)

'Get Kec'
Mobile.tap(findTestObject('Object Repository/android.view.View (5)'), 2)

'Tap sebagai alamat utama'
Mobile.tap(findTestObject('Object Repository/android.view.View (6)'), 2)

'Tap Simpan'
Mobile.tap(findTestObject('Object Repository/android.view.View (7)'), 2)

'Verify done'
Mobile.verifyElementVisible(findTestObject('Alamat/android.view.View Alamat Pengiriman'), 2, FailureHandling.STOP_ON_FAILURE)

'Wait/Delay'
Mobile.delay(10)

