package Peoj2;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@Test

public class Gestures extends Base{

	public void Test4() throws MalformedURLException{
		
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		//Tap
TouchAction ta = new TouchAction(driver);
ta.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
ta.longPress(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).release().perform();//not perofrmed


System.out.println(driver.findElementById("android:id/alertTitle").getText());











	}

}
