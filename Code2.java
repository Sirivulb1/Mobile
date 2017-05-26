
import static org.junit.Assert.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

	
public class Code2
{
	@Test
	public void test31() throws MalformedURLException, InterruptedException {
		//Step1: Open Raaga App 
		File appDir = new File("src");
		   
		    File app = new File(appDir, "Raaga.apk");

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
		Thread.sleep(5000L);
		driver.findElementById("com.raaga.android:id/ximgvwLanguage").click();
	driver.scrollTo("Gujarati");
	MobileElement abc=(MobileElement)driver.findElementById("com.raaga.android:id/xtxtvwName");
	abc.swipe(SwipeElementDirection.DOWN, 3000);
	abc.swipe(SwipeElementDirection.UP, 3000);
	System.out.println(driver.findElementsById("com.raaga.android:id/xtxtvwName").size());
	System.out.println(driver.findElementById("com.raaga.android:id/xtxtvwTitle").getText());

	
	
	
	
	
	}
}






