package com.inroad.androidTest.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/15.
 * 封装用户名，密码输入界面上的元素
 */
public class OpenApp {

    @FindBy(id = "com.gongzhidao.inroad:id/shouji_edit") //用户名输入框
    public static WebElement uname;

    @FindBy(id = "com.gongzhidao.inroad:id/login_login") //登录按钮
    public static WebElement loginButton;

    @FindBy(id = "com.gongzhidao.inroad:id/register") //立即注册按钮
    public static WebElement regeister;

    @FindBy(id = "com.gongzhidao.inroad:id/forget_passwd") //忘记密码按钮
    public static WebElement forgetpassword;

    @FindBy(id = "com.gongzhidao.inroad:id/setting") //设置按钮，用于选择服务器
    public static WebElement chooseserver;

    @FindBy(id = "com.gongzhidao.inroad:id/passwd_edit") //密码输入框
    public static WebElement passwd;
}
