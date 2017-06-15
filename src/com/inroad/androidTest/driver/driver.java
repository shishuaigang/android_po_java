package com.inroad.androidTest.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by shishuaigang on 2017/6/14.
 * This program is used to start app
 */

public class driver {

    private AndroidDriver driver;

    public  AndroidDriver get_driver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","192.168.56.102:5555");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","6.0");
        capabilities.setCapability("appPackage","com.gongzhidao.inroad");
        capabilities.setCapability("appActivity",".loginregister.LoginActivity");
        capabilities.setCapability("unicodeKeyboard","True");
        capabilities.setCapability("resetKeyboard","True");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }
}
