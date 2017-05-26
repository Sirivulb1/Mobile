import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Basic {
	
	@Test

	public void test() throws MalformedURLException {
	
		
		File appDir =new File("src");
		File app = new File (appDir,"net.one97.paytm-3.apk");
		
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
	//dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
	dc.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
	System.out.println(app.getAbsolutePath());
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
	
	driver.findElement(By.className("android.widget.TextView")).click();
	driver.findElement(By.id("net.one97.paytm:id/btn_language_continue_button")).click();
	
	
	driver.findElement(By.className("android.widget.TextView")).click();
	
	
		
		
		
		
		

	}

}
