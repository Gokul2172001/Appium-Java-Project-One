package appiumtest;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public void openCalculator() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "redmi");
		cap.setCapability("udid", "2a79980a9907 ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10.1");
		cap.setCapability("", "");
		cap.setCapability("", "");
	}

}
