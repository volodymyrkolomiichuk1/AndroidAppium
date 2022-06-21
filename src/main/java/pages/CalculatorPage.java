//package pages;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.pagefactory.AppiumFieldDecorator;
//import org.openqa.selenium.support.PageFactory;
//
//import java.time.Duration;
//
//public class CalculatorPage {
//
//    private int duration = 5;
//    AppiumDriver<MobileElement> driver;
//
//    public CalculatorPage(AppiumDriver<MobileElement> driver) {
//        this.driver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(duration)), this);
//    }
//
//    private MobileElement etInputField;
//
//    private  MobileElement btnAdd;
//
//    private list<MobileElement> itemsList;
//    public void addItem(String item) {
//
//    }
//
//    public boolean isItemExist(String item) {
//        return true;
//    }
//
//}
