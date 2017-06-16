package com.inroad.androidTest.common;

import com.inroad.androidTest.page.OpenApp;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
    }

    void inputcode(){
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'10')]")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'10')]")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'10')]")).click();
        driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'3')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    void logiN() {
        WebElement uname = driver.findElement(OpenApp.username);
        WebElement pwd = driver.findElement(OpenApp.password);
        WebElement login_btn = driver.findElement(OpenApp.loginButton);

        uname.clear();
        uname.sendKeys(username);
        pwd.clear();
        pwd.sendKeys(password);
        login_btn.click();

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
                WebElement setting = driver.findElement(OpenApp.chooseserver);
                setting.click();
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
