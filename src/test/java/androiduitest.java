import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class androiduitest extends base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver=capabilities();
		
		driver.findElement(MobileBy.AndroidUIAutomator("text(\"Views\")")).click();
		
		System.out.println(driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().clickable(true)")).size());

	}

}
