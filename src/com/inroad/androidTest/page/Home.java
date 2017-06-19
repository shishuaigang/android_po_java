package com.inroad.androidTest.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/15.
 * 登录成功后的个人主页
 */

public class Home {

    @FindBy(id="com.gongzhidao.inroad:id/switch_btn") //菜单，主页切换按钮
    public static WebElement switchbtn;

    @FindBy(id="com.gongzhidao.inroad:id/personal") //个人信息按钮
    public static WebElement personal;
}
