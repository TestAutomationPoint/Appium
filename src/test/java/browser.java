import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class browser extends baseChrome{

	public static void main(String[] args) throws MalformedURLException
	{
		// TODO Auto-generated method stub
		 
		AndroidDriver<AndroidElement> driver=baseChrome();
		
		driver.get("https://www.testautomationpoint.com/");
	}

}
