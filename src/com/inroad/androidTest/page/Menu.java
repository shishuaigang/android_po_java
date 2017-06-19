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

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'人员行为安全')]") //人员行为安全
    public static WebElement safetyBehavior;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'人员培训')]") //人员培训
    public static WebElement training;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'安全作业单')]") //安全作业单
    public static WebElement safetySheet;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'设备仪表异常管理')]") //设备仪表异常管理
    public static WebElement abnormityManagment;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'设备仪表日常管理')]") //设备仪表日常管理
    public static WebElement dailyManagment;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'关键数据')]") //关键数据
    public static WebElement coredata;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'设备维保')]") //设备维保
    public static WebElement equipMaintenance;

    @FindBy(xpath = "//android.widget.TextView[contains(@text,'知识库')]") //知识库
    public static WebElement knowledge;
}
