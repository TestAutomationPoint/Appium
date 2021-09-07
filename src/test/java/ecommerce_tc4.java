import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class ecommerce_tc4 extends base {

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
		
		driver.findElementsByXPath("//*[@text='ADD TO CART']").get(0).click();
		
		driver.findElementById("com.androidsample.generalstore:id/appbar_btn_cart").click();
		
		int count=driver.findElementsById("com.androidsample.generalstore:id/productPrice").size();
		
		double sum=0;

		for(int i=0;i<count;i++)

		{

		String amount1= driver.findElementsById("com.androidsample.generalstore:id/productPrice").get(i).getText();

		double amount=getAmount(amount1);

		sum=sum+amount;//280.97+116.97

		}

		System.out.println(sum+"sum of products");



		String total=driver.findElementById("com.androidsample.generalstore:id/totalAmountLbl").getText();



		total= total.substring(1);

		double totalValue=Double.parseDouble(total);

		System.out.println(totalValue+"Total value of products");

		Assert.assertEquals(sum, totalValue); 



		//Mobile Gestures

		WebElement checkbox=driver.findElementByClassName("android.widget.CheckBox");

		TouchAction t=new TouchAction(driver);

		t.tap(tapOptions().withElement(element(checkbox))).perform();

		

		WebElement tc=driver.findElementByXPath("//*[@text='Please read our terms of conditions']");

		t.longPress(longPressOptions().withElement(element(tc)).withDuration(ofSeconds(2))).release().perform();

		driver.findElementById("android:id/button1").click();

		Set <String> contextnames=driver.getContextHandles();
		
		System.out.println(contextnames);
		
		driver.findElementById("com.androidsample.generalstore:id/btnProceed").click();
		
		Set <String> contextnames1=driver.getContextHandles();
		
		System.out.println(contextnames1);

		
	}
	
	public static double getAmount(String value)

	{

	value= value.substring(1);

	double amount2value=Double.parseDouble(value);

	return amount2value;

	}

}
