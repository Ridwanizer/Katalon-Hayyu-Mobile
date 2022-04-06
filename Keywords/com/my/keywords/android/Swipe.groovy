package com.my.keywords.android
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import io.appium.java_client.MobileElement
import io.appium.java_client.TouchAction

class swiping {
	AppiumDriver driver;

	swiping() {
		this.driver = MobileDriverFactory.getDriver()
	}

	private scrollEntireList() {
		// very specific to android and the type of element that makes up your dropdowns
		ArrayList listElement = driver.findElementsByClassName("android.widget.CheckedTextView")
		TouchAction touchAction = new TouchAction(driver)
		def bottomElement = listElement[listElement.size() - 1]
		def topElement = listElement[0]
		// Press and scroll from the last element in the list all the way to the top
		touchAction.press(bottomElement).moveTo(topElement).release().perform();
	}

	@Keyword
	def boolean scrollListToElementWithText(String elementText) {
		boolean isElementFound = false;
		while (isElementFound == false) {
			// very specific to android and the type of element that makes up your dropdowns
			ArrayList listElement = driver.findElementsByClassName("android.widget.CheckedTextView")
			for (int i = 0; i<listElement.size(); i++) {
				String textItem = ((MobileElement)listElement[i]).getText()
				if (textItem == elementText) {
					isElementFound = true;
					return true;
				}
			}
			scrollEntireList()
		}
	}}