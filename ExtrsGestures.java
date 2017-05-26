package Peoj2;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
@Test

public class ExtrsGestures extends Base {
	
	public void test10() throws MalformedURLException
	
	{
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isLocked());
		//driver.hideKeyboard();
		driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.HOME);
		
		

		
		
		
	}

}
