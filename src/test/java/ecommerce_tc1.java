import java.net.MalformedURLException;

import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc1 extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		String toastmessage=driver.findElementByXPath("//android.widget.Toast[1]").getAttribute("name");
		
		System.out.println(toastmessage);
		
		Assert.assertEquals("Please enter your name", toastmessage);
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Ravi");
		
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		
		driver.findElementById("android:id/text1").click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"))"));
		
		driver.findElementByXPath("//*[@text='Aruba']").click();
		
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceid(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Nike SFB Jungle\").instance(0))"));
		
		driver.findElementsByXPath("//*[@text='ADD TO CART']").get(2).click();
	}

}
