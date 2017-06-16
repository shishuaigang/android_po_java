package com.inroad.androidTest.common;

import com.inroad.androidTest.page.FirstOpenApp;
import com.inroad.androidTest.page.OpenApp;
import com.inroad.androidTest.page.Home;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

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


        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(OpenApp.username);
            driver.findElement(OpenApp.password);
            val = 2;
        } catch (NoSuchElementException e) {
        }


        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(Home.switch_btn);
            driver.findElement(Home.personalInfo_btn);
            val = 3;
        } catch (NoSuchElementException e) {
        }

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(FirstOpenApp.usercode);
            val = 1;
        } catch (NoSuchElementException e) {
        }

        return val;
    }
}
