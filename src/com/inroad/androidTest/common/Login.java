package com.inroad.androidTest.common;


import static com.inroad.androidTest.page.OpenApp.*;

import com.inroad.androidTest.page.OpenApp;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

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
        OpenApp p1 = PageFactory.initElements(driver,OpenApp.class);
    }

    void inputcode(){
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'10')]")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'10')]")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'10')]")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'3')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    void logiN() {

        uname.clear();
        uname.sendKeys(username);
        passwd.clear();
        passwd.sendKeys(password);
        loginButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void login_all(int flag) {
        System.out.println("登录方式由启动activity决定");
        switch (flag) {
            case 1:
                System.out.println("安装完首次打开app的登录方式");
                inputcode();
                logiN();
                break;
            case 2:
                System.out.println("非安装完首次打开app的登录方式");
                chooseserver.click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                inputcode();
                logiN();
                break;
            case 3:
                System.out.println("处于已登录状态");
                break;
            case 4:
                driver.quit();
                break;
        }
    }
}
