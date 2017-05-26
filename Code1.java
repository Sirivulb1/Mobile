	import static org.junit.Assert.*;
		import io.appium.java_client.MobileElement;
		import io.appium.java_client.SwipeElementDirection;
		import io.appium.java_client.TouchAction;
		import io.appium.java_client.android.AndroidDriver;
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

	
	
		public class Code1
		{
			@Test
			public void test() throws MalformedURLException, InterruptedException {
				//Step1: Open Raaga App 
				File appDir = new File("src");
				   
				    File app = new File(appDir, "com.raaga.android-1.apk");

				DesiredCapabilities cap=new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
				cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
				
				cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
				cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
				AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap );
				//Step2: Scroll down and select Trending now option in Menu
				driver.scrollTo("Trending Now");
				TouchAction t=new TouchAction(driver);
				WebElement abc=driver.findElementById("com.raaga.android:id/xrellay_TrendingNow");
				t.tap(abc).perform();
				//Step 3: Select a song called “Tum”-
				List <WebElement> xyz=driver.findElementsByClassName("android.widget.TextView");
				for(int i=0;i<xyz.size();i++)
				{
				
				if(xyz.get(i).getText().contains("Tum"))
				{
					//Step 4: Long click on selected Song
					
					t.longPress(xyz.get(i)).perform();
					Thread.sleep(5000L);
					driver.findElementByAndroidUIAutomator("new UiSelector().text(\"Play All\")").click();
					System.out.println("Song succesfull played");
				}
			
				
				
			}
			}
		}






