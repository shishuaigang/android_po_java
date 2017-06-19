package com.inroad.androidTest.testcase;

import com.inroad.androidTest.common.*;
import com.inroad.androidTest.driver.Driver;
import com.inroad.androidTest.page.*;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

import static com.inroad.androidTest.page.Home.*;
import static com.inroad.androidTest.page.Knowledge.*;
import static com.inroad.androidTest.page.Menu.*;

/**
 * Created by shishuaigang on 2017/6/15.
 * 测试用testcase
 */

public class test {
    public static void main(String args[]) {
        AndroidDriver d = new Driver().get_driver();
        int i;
        i = new Flag(d).pagejudge();
        Login ll = new Login("18121225109", "123456", d);
        ll.login_all(i);
        Home p1 = PageFactory.initElements(d,Home.class);
        Menu p2 = PageFactory.initElements(d,Menu.class);
        Knowledge p3 = PageFactory.initElements(d,Knowledge.class);

        switchbtn.click();
        knowledge.click();
        browse.click();
    }
}
