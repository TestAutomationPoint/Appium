import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ecommerce_tc5 extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Ravi");
		
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		
		driver.findElementById("android:id/text1").click();
		
		Thread.sleep(2000);
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"))"));
		
		driver.findElementByXPath("//*[@text='Algeria']").click();
		
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		Thread.sleep(2000);
		
		driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
		
		
		
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		
		Thread.sleep(2000);
		
		driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
		
		Thread.sleep(5000);
		
		Set <String> contextnames1=driver.getContextHandles();
		
		System.out.println(contextnames1);
		
		driver.context("WEBVIEW_com.androidsample.generalstore");
		
		Thread.sleep(2000);
		
		
		driver.findElementByXPath("//*[@name='q']").sendKeys("Hello");
		
		driver.findElementByXPath("//*[@name='q']").sendKeys(Keys.ENTER);
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		

	}
	
	
}
