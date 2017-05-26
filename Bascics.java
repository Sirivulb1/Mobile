package Peoj2;

import java.awt.List;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Bascics extends Base{
	
	@Test

	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		System.out.println(driver.findElements(By.className("android.widget.TextView")).size());
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();//By Test
		driver.findElementById("android:id/checkbox").click();
	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("Bobby");
		//driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
		
	
		
		
		
		

	}

}
