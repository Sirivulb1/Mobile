package Peoj2;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
@Test

public class Swipe extends Base {
	
public void Test5() throws MalformedURLException{
		
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		TouchAction t = new TouchAction(driver);
		t.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(3000).moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
		
	
		
		
		
		
		
}

}
