package com.inroad.androidTest.page;

import org.openqa.selenium.By;

/**
 * Created by shishuaigang on 2017/6/15.
 * 非首次打开app登录页面
 */
public class openapp {
    public static By username = By.id("com.gongzhidao.inroad:id/shouji_edit"); //用户名输入框
    public static By password = By.id("com.gongzhidao.inroad:id/passwd_edit"); //密码输入框'
    public static By loginButton = By.id("com.gongzhidao.inroad:id/login_login"); //登录按钮
    public static By regeister = By.id("com.gongzhidao.inroad:id/register"); //立即注册按钮
    public static By forgetpassword = By.id("com.gongzhidao.inroad:id/forget_passwd"); //忘记密码按钮
    public static By chooseserver = By.id("com.gongzhidao.inroad:id/setting"); //设置按钮，用于选择服务器
}
