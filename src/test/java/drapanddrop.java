import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class drapanddrop extends base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Drag and Drop\")")).click();
		
		TouchAction t=new TouchAction(driver);
		
		WebElement first=driver.findElementById("io.appium.android.apis:id/drag_dot_1");
		
		WebElement last=driver.findElementById("io.appium.android.apis:id/drag_dot_2");
		
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(last)).release().perform();
	}

}
