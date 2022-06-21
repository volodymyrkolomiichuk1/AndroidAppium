import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class HomeWork2 {


        public static void main(String[] args) throws MalformedURLException, InterruptedException {

            DesiredCapabilities dc = new DesiredCapabilities();

            dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
            dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_5_API_30");
            dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
            dc.setCapability("appPackage", "com.dmytro.herasymchuk.hybridapp");
            dc.setCapability("appActivity", "MainActivity");
            URL url = new URL("http://0.0.0.0:4723/wd/hub");

            AndroidDriver driver = new AndroidDriver(url, dc);

            Thread.sleep(3_000);

            WebElement searchField = driver.findElementById("com.dmytro.herasymchuk.hybridapp:id/search_field");
            searchField.click();
            searchField.sendKeys("https://www.desmos.com/scientific");
            WebElement goBtn = driver.findElementById("com.dmytro.herasymchuk.hybridapp:id/search_btn");
            goBtn.click();
            Thread.sleep(5_000);


            WebElement two = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[23]/android.widget.Button");
            two.click();
            WebElement plus = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[33]/android.widget.Button");
            plus.click();
            two.click();

            WebElement results = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View");

            if(results.getText().equals("equals 4"))
            {
                System.out.println("Result is equal 4");
            }
            else
            {
                System.out.println("Test Failed");
            }
        }

    }
