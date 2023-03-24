package Core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Helper {

    DesiredCapabilities dc = new DesiredCapabilities();

    AndroidDriver driver = null;


    public AndroidDriver apkLaunch() throws MalformedURLException, InterruptedException {

        //dc.setCapability(MobileCapabilityType.UDID, "60a844e6");
        dc.setCapability(MobileCapabilityType.UDID, "ES2BB80614000979");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
       // dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi Note 7");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Nokia 3.1");
        dc.setCapability("platformVersion", "11.0");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
        dc.setCapability("disableWindowAnimation", true);
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");

        dc.setCapability("ignoreUnimportantViews", true);
        dc.setCapability("disableAndroidWatchers", true);

        Thread.sleep(1000);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4724/wd/hub"), dc);

        return driver;

    }

}
