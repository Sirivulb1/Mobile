package IOS;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


@Test
public class Basic {
	
	
	public void Test33() throws MalformedURLException{ 
		
		
	
	DesiredCapabilities Cap = new DesiredCapabilities();
	File fi = new File("/Users/bobbysirivuluri/Downloads/ios-uicatalog-master.zip");
	Cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
	Cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
	Cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
	Cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
	Cap.setCapability(MobileCapabilityType.APP, fi.getAbsolutePath());
	IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),Cap);
	
	
	

	}

	
	

}
