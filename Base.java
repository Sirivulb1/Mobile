package Peoj2;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		
		File f = new File("src");
		File fs = new File (f,"ApiDemos-debug.apk");
		
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidEmulator");
		dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		dc.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		return driver;
		
		
		
		
		

	}

}
