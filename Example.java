package Peoj2;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

@Test

public class Example extends Base{
	public void Test11() throws MalformedURLException{
		
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		List a = driver.findElementsByClassName("android.view.View");
		System.out.println(a.size());
		System.out.println(a);//seeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee re check
		
		
		
		
		
	}

}
