import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class BMS {

	@Test

	public void test() throws MalformedURLException {

		File appDir = new File("src");
		File app = new File(appDir, "Saavn.apk");

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");

		 dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1000");
		dc.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		 
	driver.findElementById("com.saavn.android:id/logIn").click();
	driver.findElementById("com.saavn.android:id/topRightButton").click();
	//driver.findElement(By.id("com.saavn.android:id/signUpText")).click();
//driver.findElement(By.className("android.widget.TextView")).click();
	
	
	

	}
}
