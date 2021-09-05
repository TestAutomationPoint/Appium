import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities() throws InterruptedException, MalformedURLException
	{
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		DesiredCapabilities cap=new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.APP, path+"//ApiDemos-debug.apk");
		
		cap.setCapability(MobileCapabilityType.APP, path+"//General-Store.apk");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		URL url=new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(url, cap);
		
		Thread.sleep(5000);
		
		
		return driver;
	}

}
