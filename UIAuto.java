package Peoj2 ;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
@Test

public class UIAuto extends Base{

	public void test3() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.findElementByAndroidUIAutomator("Attribute(value)");
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//driver.findElementByAndroidUIAutomator("new UiSelector().Attribute(\"Value\")");
		
		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(\"true\")").getSize());
		
		
		
		
		
		

	}

}
