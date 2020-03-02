package com.instagram.android.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.instagram.android.pages.LoginPage;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.touch.offset.PointOption;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.WebDriverFacade;

public class CommonFunctionAndroid extends MobilePageObject{
	
	private static final String MobileElement = null;
	LoginPage loginPage;
	
	public CommonFunctionAndroid(WebDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}

	@SuppressWarnings("unchecked")
	AndroidDriver<MobileElement> androidDriver = ((AndroidDriver<MobileElement>) ((WebDriverFacade) getDriver())
			.getProxiedDriver());

	@SuppressWarnings("rawtypes")
	public void swipe() {
	TouchAction touchAction = new TouchAction(androidDriver);
	int x = 0;
	int y = 990;
	int newx = 0;
	int newy = 190;
	touchAction.longPress(PointOption.point(x, y)).moveTo(PointOption.point(newx, newy)).release().perform();
	//new TouchAction((PerformsTouchActions) conexionAppium).longPress(0, 990).moveTo(0, 190).release().perform();
	 
	}

	// no esta terminada..., no me funciona el cast
		@SuppressWarnings("rawtypes")
		public void tapElement() {
			TouchAction touchAction = new TouchAction(androidDriver);
			AndroidElement androidElement= (AndroidElement) loginPage.getBtnProFile();
		
			touchAction.tap(tapOptions().withElement(element(androidElement)))
	        .waitAction(waitOptions(Duration.ofSeconds(6)))
	        .perform();
		}
		
	//Un tap usando coordenadas. 
	@SuppressWarnings("rawtypes")
	public void tapCoordinates(int x, int y) {
		TouchAction touchAction = new TouchAction(androidDriver);
		touchAction.tap(PointOption.point(x, y)).perform();
	}
	
	//Un multitap usando coordenadas. 
		@SuppressWarnings("rawtypes")
		public void multiTapCoordinates(int x, int y, int n) {
			TouchAction touchAction = new TouchAction(androidDriver);
			for(int i=0; i<n; i++) {
				touchAction.tap(PointOption.point(x, y)).perform();
			}
		}
	//Un tap usando coordenadas con espera.
	@SuppressWarnings("rawtypes")
	public void tapCoordinatesWait(int x, int y, long seconds) {
		TouchAction touchAction = new TouchAction(androidDriver);
		touchAction.tap(PointOption.point(x, y))
          .waitAction(waitOptions(Duration.ofSeconds(seconds))).perform();
	}
	//Un multiTouch
	@SuppressWarnings("rawtypes")
	public void multiTouch() {
		TouchAction touchActionOne = new TouchAction(androidDriver);
        touchActionOne.press(PointOption.point(53, 1053));
        //touchActionOne.release();
        
        TouchAction touchActionTwo = new TouchAction(androidDriver);
        touchActionTwo.press(PointOption.point(667, 1053));
        //touchActionTwo.release();
        
        MultiTouchAction action = new MultiTouchAction(androidDriver);
        action.add(touchActionOne);
        action.add(touchActionTwo);
        action.perform();
		
	}
	
    // presionar con coordenas sin espera.
	 @SuppressWarnings("rawtypes")
		public void pressCoordinates(int x, int y) {
			 TouchAction touchAction = new TouchAction(androidDriver);
		          touchAction.press(PointOption.point(x,y))
		                     .release()
		                     .perform();
		 }
	
	//Presionar un elemento usando coordenadas y con una espera en segundos dejando presionado en el elemento.
	 @SuppressWarnings("rawtypes")
	public void pressCoordinatesWait(int x, int y, long seconds) {
		 TouchAction touchAction = new TouchAction(androidDriver);
	          touchAction.press(PointOption.point(x,y))
	                     .waitAction(waitOptions(Duration.ofSeconds(seconds)))
	                     .release()
	                     .perform();
	 }


	 //medidas de la pantalla del dispositivo
	 @SuppressWarnings("unused")
	public void screenSice() {
		 int heightOfScreen = androidDriver.manage().window().getSize().getHeight();
		    int widthOfScreen = androidDriver.manage().window().getSize().getWidth();        
		    int middleHeightOfScreen = heightOfScreen/2;
		    // To get 50% of width
		    int x = (int) (widthOfScreen * 0.5);
		    // To get 50% of height
		    int y = (int) (heightOfScreen * 0.5);
		    System.out.println("alto " + heightOfScreen +" ancho "+ widthOfScreen +" x "+ x + " y "+ y  );
	 }
	 
	 //desplazamiento de hacia la derecha, es decir de derecha a izquierda	
	 @SuppressWarnings("rawtypes")
	public void swipeRight(int x, int y, int newX, int newY) {
		 TouchAction touchAction = new TouchAction(androidDriver);
		 touchAction.longPress(PointOption.point(x, y))
		// touchAction.press(PointOption.point(x,y))
		  //          .waitAction(waitOptions(Duration.ofSeconds(2)))
		            .moveTo(PointOption.point(newX,newY))
		            .release()
		            .perform();
	 }
	 //desplazamiento de hacia la derecha, es decir de derecha a izquierda	
	 @SuppressWarnings("rawtypes")
	public void multiSwipeRight(int x, int y, int newX, int newY, int n) {
		 TouchAction touchAction = new TouchAction(androidDriver);
		 for(int i=0; i<n; i++) {
			 touchAction.longPress(PointOption.point(x, y))
			            .moveTo(PointOption.point(newX,newY))
			            .release()
			            .perform();	 
		 }
		
	 }
	 
	 //desplazamiento de hacia la izquierda, es decir de izquierda a derecha.	
	 @SuppressWarnings("rawtypes")
	public void swipeLeft(int x, int y, int newX, int newY) {
		 TouchAction touchAction = new TouchAction(androidDriver);
		 touchAction.press(PointOption.point(x,y))
		            .waitAction(waitOptions(Duration.ofSeconds(1)))
		            .moveTo(PointOption.point(newX,newY))
		            .release()
		            .perform();
	 }
	 
	 
	//ScrollDown usando coordenadas
		@SuppressWarnings("rawtypes")
		public void scrollDown(int x, int y, int newX, int newY) {
			TouchAction touchAction = new TouchAction(androidDriver);
			touchAction.longPress(PointOption.point(x, y)).moveTo(PointOption.point(newX, newY)).release().perform();
		}
		
		//ScrollDown usando coordenadas
				@SuppressWarnings("rawtypes")
				public void scrollUp(int x, int y, int newX, int newY) {
					TouchAction touchAction = new TouchAction(androidDriver);
					touchAction.longPress(PointOption.point(340, 414)).moveTo(PointOption.point(340, 947)).release().perform();
				}
    // para bloquear y desbloquear el dispositivo.
	public void lockDevice(){
		androidDriver.lockDevice();
		androidDriver.unlockDevice();
		
	}
		
	public void waitElement(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(Duration.ofSeconds(60))
		.pollingEvery(Duration.ofMillis(1000)).ignoring(NoSuchElementException.class)
		.ignoring(TimeoutException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
		}
}
