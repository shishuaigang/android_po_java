package com.inroad.androidTest.common;

import com.inroad.androidTest.page.FirstOpenApp;
import com.inroad.androidTest.page.OpenApp;
import com.inroad.androidTest.page.Home;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.inroad.androidTest.page.FirstOpenApp.*;
import static com.inroad.androidTest.page.Home.*;
import static com.inroad.androidTest.page.OpenApp.*;

/**
 * Created by shishuaigang on 2017/6/14.
 * 标识点，用来确定处于什么界面
 */

public class Flag {

    private WebDriver driver;

    public Flag(WebDriver d) {
        this.driver = d;
    }


    public int pagejudge() {
        int val = 4;
        OpenApp p1 = PageFactory.initElements(driver,OpenApp.class);
        Home p2 = PageFactory.initElements(driver,Home.class);
        FirstOpenApp p3 = PageFactory.initElements(driver,FirstOpenApp.class);

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            uname.isDisplayed();
            passwd.isDisplayed();
            val = 2;
        } catch (NoSuchElementException e) {
        }


        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            switchbtn.isDisplayed();
            personal.isDisplayed();
            val = 3;
        } catch (NoSuchElementException e) {
        }

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            usercode.isDisplayed();
            val = 1;
        } catch (NoSuchElementException e) {
        }

        return val;
    }
}
