package com.instagram.android.steps;


import static io.appium.java_client.touch.WaitOptions.waitOptions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.instagram.android.pages.LoginPage;
import com.instagram.android.utilities.CommonFunctionAndroid;

import cucumber.api.DataTable;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;


public class LoginSteps extends PageObject{
	
	LoginPage loginPage;
	CommonFunctionAndroid  commonFunctionAndroid;
	
	@Step
	public void openPage() {
		loginPage.open();
	}
	
	@Step
	public void enterWord(String word) throws InterruptedException {
		System.out.println(word);
//		Actions action = new Actions(getDriver());
//		action.moveToElement(loginPage.getUrlGoogle());
//		action.sendKeys("https://www.google.com/");
//		action.sendKeys(Keys.RETURN); 
//		action.build().perform();
	 Thread.sleep(8000);
		loginPage.getInputGoogle().sendKeys(word);
		
		System.out.println(loginPage.getInputGoogle().getText());
	
	}
	
	@Step
	public void addFavorite() throws InterruptedException {

		
		//commonFunctionAndroid.lockDevice();
		//commonFunctionAndroid.tapElement();
		//commonFunctionAndroid.swipeRight(665,719,108,719);
		//commonFunctionAndroid.multiSwipeRight(665,719,108,719,4);
		//commonFunctionAndroid.swipeLeft(72,719,665,719);
		//commonFunctionAndroid.swipe();
		//loginPage.getBtnShutter().click();
		//commonFunctionAndroid.screenSice();
		//commonFunctionAndroid.tapCoordinates(340,784);
		//commonFunctionAndroid.multiTapCoordinates(340,784,2);
		//commonFunctionAndroid.tapCoordinatesWait(667,90,6);
		//commonFunctionAndroid.pressCoordinates(667,90);
		//commonFunctionAndroid.pressCoordinatesWait(667,90,6);
		//commonFunctionAndroid.scrollDown(340,947,340, 414);
		//commonFunctionAndroid.scrollUp(340,414,340, 947);
		//commonFunctionAndroid.multiTouch();
		Thread.sleep(6000);
		
//loginPage.getBtnProFile().click();
		
	}

	

	
}
