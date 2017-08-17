package com.inroad.androidTest.common;

import com.inroad.androidTest.page.CustomerCode;
import com.inroad.androidTest.page.Home;
import com.inroad.androidTest.page.OpenApp;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;


import static com.inroad.androidTest.page.CustomerCode.*;
import static com.inroad.androidTest.page.Home.*;
import static com.inroad.androidTest.page.OpenApp.*;

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
        int val;
        OpenApp p1 = PageFactory.initElements(driver, OpenApp.class);
        Home p2 = PageFactory.initElements(driver, Home.class);
        CustomerCode p3 = PageFactory.initElements(driver, CustomerCode.class);
        if (new IsElementExist(switchbtn).isElementExist() && new IsElementExist(personal).isElementExist()) {
            val = 3;
        } else if (new IsElementExist(uname).isElementExist() && new IsElementExist(passwd).isElementExist()) {
            val = 2;
        } else if (new IsElementExist(usercode_1).isElementExist()) {
            val = 1;
        } else if (new IsElementExist(usercode_2).isElementExist()) {
            val = 4;
        } else {
            val = 0;
        }
        return val;
    }
}
