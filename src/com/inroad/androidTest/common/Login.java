package com.inroad.androidTest.common;


import com.inroad.androidTest.page.OpenApp;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.inroad.androidTest.page.OpenApp.*;

/**
 * Created by shishuaigang on 2017/6/15.
 * 登录功能封装
 */
public class Login {

    private String username;
    private String password;
    private AndroidDriver driver;

    public Login(String u, String p, AndroidDriver d) {
        this.username = u;
        this.password = p;
        this.driver = d;
        OpenApp p1 = PageFactory.initElements(driver, OpenApp.class);
    }

    private void inputcode() {
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'10')]")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'10')]")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'10')]")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'3')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    private void logiN() {
        uname.clear();
        uname.sendKeys(username);
        passwd.clear();
        passwd.sendKeys(password);
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void login_all(int flag) {
        System.out.println("登录中...");
        switch (flag) {
            case 1:
                inputcode();
                logiN();
                break;
            case 2:
                chooseserver.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                inputcode();
                logiN();
                break;
            case 3:
                break;
            case 4:
                inputcode();
                break;
            case 0:
                driver.quit();
                break;
        }
    }
}
