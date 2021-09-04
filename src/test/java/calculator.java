import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class calculator {

	public static void main(String[] args) throws InterruptedException, MalformedURLException
	{
		// TODO Auto-generated method stub
		AppiumDriver<MobileElement> driver;
		
		String path=System.getProperty("user.dir");
		DesiredCapabilities dc=new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OPPO F19 Pro");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		dc.setCapability("app", path+"//TAP.apk");
		
		//dc.setCapability("app", path+"com.colors.calculator");
		
		//dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		driver=new AndroidDriver<MobileElement>(url, dc);
		
		Thread.sleep(10000);
		
		driver.findElementByXPath("//android.view.View[@text='SeleniumJava']").click();
		
}
}
