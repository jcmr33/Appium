package com.instagram.android.pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Cámara']/android.widget.ImageView")
	public WebElementFacade btnPlus;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Perfil']/android.widget.ImageView")
	public WebElementFacade  btnProFile;
	
	@AndroidFindBy(id="row_feed_button_like")
	public WebElementFacade btnFavorite;
	
	
	@AndroidFindBy(id="camera_shutter_button")
	public WebElementFacade btnShutter;

	@FindBy(id="downshift-0-input")
	public WebElement inputGoogle;
	
	@FindBy(id="url_bar")
	public WebElementFacade urlGoogle;
	
	
	
	public WebElementFacade getUrlGoogle() {
		return urlGoogle;
	}

	public WebElementFacade getBtnPlus() {
		return btnPlus;
	}

	public WebElementFacade getBtnProFile() {
		return btnProFile;
	}

	public WebElementFacade getBtnFavorite() {
		return btnFavorite;
	}

	public WebElementFacade getBtnShutter() {
		return btnShutter;
	}

	public WebElement getInputGoogle() {
		return inputGoogle;
	}

	
	
	
}
