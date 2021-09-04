import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

public class gestures extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		
		TouchAction t=new TouchAction(driver);
		
		WebElement expandlist=driver.findElement(MobileBy.AndroidUIAutomator("text(\"Expandable Lists\")"));
		t.tap(tapOptions().withElement(element(expandlist))).perform();
		
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"1. Custom Adapter\")")).click();
		
		
		WebElement peoplenames=driver.findElement(MobileBy.AndroidUIAutomator("text(\"People Names\")"));
		
		t.longPress(longPressOptions().withElement(element(peoplenames)).withDuration(ofSeconds(2))).release().perform();
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		
	}

}
