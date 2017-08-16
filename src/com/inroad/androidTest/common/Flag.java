package com.inroad.androidTest.common;

import com.inroad.androidTest.page.CustomerCode;
import com.inroad.androidTest.page.Home;
import com.inroad.androidTest.page.OpenApp;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.inroad.androidTest.page.CustomerCode.*;
import static com.inroad.androidTest.page.Home.personal;
import static com.inroad.androidTest.page.Home.switchbtn;
import static com.inroad.androidTest.page.OpenApp.passwd;
import static com.inroad.androidTest.page.OpenApp.uname;

/**
 * Created by shishuaigang on 2017/6/14.
 * 标识点，用来确定处于什么界面
 */

public class Flag {

    private AndroidDriver driver;

    public Flag(AndroidDriver d) {
        this.driver = d;
    }


    public int pageJudge() {
        int val = 0;
        OpenApp p1 = PageFactory.initElements(driver, OpenApp.class);
        Home p2 = PageFactory.initElements(driver, Home.class);
        CustomerCode p3 = PageFactory.initElements(driver, CustomerCode.class);

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            usercode_1.isDisplayed();
            val = 1;  // 输入用户代码的界面，判定为首次打开app
        } catch (NoSuchElementException e) {
        }

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            uname.isDisplayed();
            passwd.isDisplayed();
            val = 2;   // 出现输入用户名，密码的界面，判定为非首次打开app(可能是退出后重新打开app)
        } catch (NoSuchElementException e) {
        }

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            switchbtn.isDisplayed();
            personal.isDisplayed();
            val = 3;   // 进入首页，判定为已登录状态
        } catch (NoSuchElementException e) {
        }

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            usercode_2.isDisplayed();
            val = 4;  // 输入用户代码的界面，根据判断标准的不同，应该为长时间未打开app后产生的输入用户代码界面
        } catch (NoSuchElementException e) {
        }

        return val;
    }
}
