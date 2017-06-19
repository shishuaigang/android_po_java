package com.inroad.androidTest.testcase;

import com.inroad.androidTest.common.Flag;
import com.inroad.androidTest.common.Login;
import com.inroad.androidTest.driver.Driver;
import com.inroad.androidTest.page.Home;
import com.inroad.androidTest.page.Knowledge;
import com.inroad.androidTest.page.Menu;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.inroad.androidTest.page.Home.switchbtn;
import static com.inroad.androidTest.page.Knowledge.browse;
import static com.inroad.androidTest.page.Menu.knowledge;

/**
 * Created by shishuaigang on 2017/6/19.
 * 测试用的testcase
 */

public class testTest {

    private AndroidDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new Driver().get_driver();
        int i;
        i = new Flag(driver).pagejudge();
        Login ll = new Login("18121225109", "123456", driver);
        ll.login_all(i);
        Home p1 = PageFactory.initElements(driver, Home.class);
        Menu p2 = PageFactory.initElements(driver, Menu.class);
        Knowledge p3 = PageFactory.initElements(driver, Knowledge.class);
    }

    @Test
    public void TestNgLearn() {
        switchbtn.click();
        knowledge.click();
        browse.click();
        Assert.assertEquals("知识库浏览",driver.findElement(By.id("com.gongzhidao.inroad:id/tv_topbar_name")).getText().trim());
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}