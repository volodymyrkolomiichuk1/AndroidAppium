import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HomeWork1_new {
    AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_5_API_30");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
        dc.setCapability("appPackage", "com.google.android.calculator");
        dc.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
        Thread.sleep(3_000);
    }
//    AndroidDriver = driver;

    @Test
    public void sampleTest() {
        WebElement two = driver.findElementById("com.google.android.calculator:id/digit_2");
        two.click();
        WebElement plus = driver.findElementById("com.google.android.calculator:id/op_add");
        plus.click();
        two.click();
        WebElement equal = driver.findElementById("com.google.android.calculator:id/eq");
        equal.click();

        WebElement results = driver.findElementById("com.google.android.calculator:id/result_final");

        if (results.getText().

                equals("4")) {
            System.out.println("Result is equal 4");
        } else {
            System.out.println("Test Failed");
        }
    }

       @After
       public void tearDown() throws InterruptedException {
       Thread.sleep(10_000);
       driver.quit();
           }
        }


