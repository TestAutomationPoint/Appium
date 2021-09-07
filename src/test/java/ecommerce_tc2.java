import java.net.MalformedURLException;

import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc2 extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Ravi");
		
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		
		driver.findElementById("android:id/text1").click();
		
		Thread.sleep(5000);
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"))"));
		
		driver.findElementByXPath("//*[@text='Aruba']").click();
		
		

	   
	}

}
