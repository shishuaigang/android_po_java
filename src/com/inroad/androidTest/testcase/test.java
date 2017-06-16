package com.inroad.androidTest.testcase;

import com.inroad.androidTest.common.*;
import com.inroad.androidTest.driver.Driver;
import com.inroad.androidTest.page.*;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by shishuaigang on 2017/6/15.
 */
public class test {
    public static void main(String args[]) {
        AndroidDriver d = new Driver().get_driver();
        int i;
        i = new Flag(d).pagejudge();
        Login ll = new Login("18121225109", "123456", d);
        ll.login_all(i);
        d.findElement(Home.switch_btn).click();
        d.findElement(Menu.knowledge).click();
        d.findElement(Knowledge.browse).click();
    }
}
