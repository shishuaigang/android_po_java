package com.inroad.androidTest.common;

import com.inroad.androidTest.page.openapp;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

/**
 * Created by shishuaigang on 2017/6/15.
 * 登录功能封装
 */
public class login {

    private String username;
    private String password;
    private AndroidDriver driver;

    public login(String u, String p, AndroidDriver d) {
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
        WebElement uname = driver.findElement(openapp.username);
        WebElement pwd = driver.findElement(openapp.password);
        WebElement login_btn = driver.findElement(openapp.loginButton);

        uname.clear();
        uname.sendKeys(username);
        pwd.clear();
        pwd.sendKeys(password);
        login_btn.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void login_all(int flag) {
        switch (flag) {
            case 1:
                System.out.println("安装完首次打开app");
                inputcode();
                logiN();
                break;
            case 2:
                System.out.println("非安装完首次打开app");
                WebElement setting = driver.findElement(openapp.chooseserver);
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
