import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class swipping extends base
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Date Widgets\")")).click();
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"2. Inline\")")).click();
		
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		TouchAction t= new TouchAction(driver);
		
		WebElement fif=driver.findElementByXPath("//*[@content-desc='15']");
		
		WebElement ft=driver.findElementByXPath("//*[@content-desc='45']");
		
		t.longPress(longPressOptions().withElement(element(fif)).withDuration(ofSeconds(2))).moveTo(element(ft)).release().perform();
		
		
		
	}
}
