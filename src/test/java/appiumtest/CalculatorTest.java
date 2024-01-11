import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CalculatorTest {

    public static void main(String[] args) {
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "redmi");
            caps.setCapability(MobileCapabilityType.UDID, "2a79980a9907");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
            caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.ads.fettello");
            caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.miui.calculator.cal.CalculatorActivity");
            
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60000); // Replace 


            URI uri = new URI("http://127.0.0.1:4723/wd/hub");
            URL url = uri.toURL();

            AndroidDriver<AndroidElement> driver = new AndroidDriver<>(url, caps);

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            driver.launchApp();

            System.out.println("Application started");

            WebDriver GetStarted = driver.findElement(By.id)
                GetStarted.click();

            driver.closeApp();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
    }
}

