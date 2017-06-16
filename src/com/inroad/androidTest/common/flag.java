package com.inroad.androidTest.common;

import com.inroad.androidTest.page.firstopenapp;
import com.inroad.androidTest.page.openapp;
import com.inroad.androidTest.page.home;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by shishuaigang on 2017/6/14.
 * 标识点，用来确定处于什么界面
 */

public class flag {

    private WebDriver driver;

    public flag(WebDriver d) {
        this.driver = d;
    }


    public int pagejudge() {
        int val = 4;


        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(openapp.username);
            driver.findElement(openapp.password);
            val = 2;
        } catch (NoSuchElementException e) {
        }


        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(home.switch_btn);
            driver.findElement(home.personalInfo_btn);
            val = 3;
        } catch (NoSuchElementException e) {
        }

        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(firstopenapp.usercode);
            val = 1;
        } catch (NoSuchElementException e) {
        }

        return val;
    }
}
