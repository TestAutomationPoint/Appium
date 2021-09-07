import java.net.MalformedURLException;

import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ecommerce_tc3 extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
		
		
		driver.findElementById("com.androidsample.generalstore:id/nameField").sendKeys("Ravi");
		
		driver.findElementById("com.androidsample.generalstore:id/radioFemale").click();
		
		driver.findElementById("android:id/text1").click();
		
		Thread.sleep(5000);
		
		//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Algeria\"))"));
		
		driver.findElementByXPath("//*[@text='Algeria']").click();
		
		driver.findElementById("com.androidsample.generalstore:id/btnLetsShop").click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"))"));
		
		int count=    driver.findElementsById("com.androidsample.generalstore:id/productName").size();
		
		System.out.println(count);
		
		for(int i=0;i<count;i++)

	    {

	    String text=driver.findElementsById("com.androidsample.generalstore:id/productName").get(i).getText();
	    System.out.println(text);
	   

	    if(text.equalsIgnoreCase("Jordan 6 Rings"))

	    {

	   

	    	driver.findElementsById("com.androidsample.generalstore:id/productAddCart").get(i).click();

	    	break;

	    }

	    }
		
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		
		String lastpageText=driver.findElementById("com.androidsample.generalstore:id/productName").getText();
		

		Assert.assertEquals("Jordan 6 Rings", lastpageText);

	   
	}

}
