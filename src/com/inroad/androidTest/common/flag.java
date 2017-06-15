package com.inroad.androidTest.common;

import com.inroad.androidTest.driver.driver;
import com.inroad.androidTest.page.firstopenapp;
import com.inroad.androidTest.page.openapp;
import com.inroad.androidTest.page.home;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by shishuaigang on 2017/6/14.
 * 标识点，用来确定处于什么界面
 */

public class flag {

    private WebDriver driver;

    public flag(WebDriver d) {
        this.driver = d;
    }

    //判定是否为安装完的首次打开app
    public int pagejudge() {
        int val =4;
        try {
            driver.findElement(firstopenapp.usercode);
            val = 1;
        } catch (NoSuchElementException e) {

        }

        try {
            driver.findElement(openapp.username);
            driver.findElement(openapp.password);
            val = 2;
        } catch (NoSuchElementException e) {

        }

        try {
            driver.findElement(home.switch_btn);
            driver.findElement(home.personalInfo_btn);
            val = 3;
        } catch (NoSuchElementException e) {

        }

        return val;

    }

    public static void main(String args[]) {
        AndroidDriver d = new driver().get_driver();
        flag f = new flag(d);
        System.out.println(f.pagejudge());
    }
}
