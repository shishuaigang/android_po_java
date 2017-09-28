package com.inroad.androidTest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/16.
 * 封装功能菜单页面上的元素
 */

public class Menu {

    @FindBy(id = "com.gongzhidao.inroad:id/process") //流程
    public static WebElement process;

    @FindBy(id = "com.gongzhidao.inroad:id/bell") //提醒
    public static WebElement notification;

    @FindBy(id = "com.gongzhidao.inroad:id/task") //任务
    public static WebElement task;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'工艺管理')]") //工艺管理
    public static WebElement process_management;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'机电管理')]") //机电管理
    public static WebElement electromechanical_management;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'HSE')]") //HSE管理
    public static WebElement hse;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'信息库')]") //信息库
    public static WebElement knowledge;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'培训管理')]") //培训管理
    public static WebElement training_management;
}
