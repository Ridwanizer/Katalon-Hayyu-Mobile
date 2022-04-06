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

'Tap Skip'
Mobile.tap(findTestObject('Login/android.view.View (Skip)'), 2)

'Tap button masuk'
Mobile.tap(findTestObject('Login/android.widget.ImageView (Masuk, Daftar)'), 2)

'Set text number'
Mobile.setText(findTestObject('Login/android.widget.EditText (No Hp)'), '081232115321', 0)

'Set text password'
Mobile.setText(findTestObject('Login/android.widget.EditText (Pass)'), '12345', 0)

'Tap login'
Mobile.tap(findTestObject('Login/android.view.View (Masuk Log in page)'), 2)

'Verify'
Mobile.verifyElementVisible(findTestObject('Beranda/android.view.View - Utama'), 10)

