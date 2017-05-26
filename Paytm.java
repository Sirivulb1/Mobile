package Peoj2;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
@Test

public class Paytm {
	
	public void Test33() throws MalformedURLException, InterruptedException{
		
		
		File f = new File("src");
		File fs = new File (f,"net.one97.paytm.apk");
		
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "300");
		dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementById("net.one97.paytm:id/btn_language_continue_button").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Do It Later']").click();
		//driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Do It Later\"))");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		try{
		driver.swipe(3, 25, 30, 30, 5000);// seeeeeeeeeeeeeeeeeee once more
		}
		catch(Exception e)
		{
			
			
		}
		
		
		
	}

}
