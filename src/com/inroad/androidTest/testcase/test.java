package com.inroad.androidTest.testcase;

import com.inroad.androidTest.common.flag;
import com.inroad.androidTest.common.login;
import com.inroad.androidTest.driver.driver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by shishuaigang on 2017/6/15.
 */
public class test {
    public static void main(String args[]) {
        AndroidDriver d = new driver().get_driver();
        int i = 0;
        try {
            i = new flag(d).pagejudge();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(i);
        login ll = new login("18121225109", "123456",d);
        ll.login_all(i);
        d.quit();
    }
}
