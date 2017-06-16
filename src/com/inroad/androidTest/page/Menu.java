package com.inroad.androidTest.page;

import org.openqa.selenium.By;

/**
 * Created by shishuaigang on 2017/6/16.
 * 封装功能菜单页面上的元素
 */

public class Menu {

    public static By process = By.id("com.gongzhidao.inroad:id/process"); //流程
    public static By notification = By.id("com.gongzhidao.inroad:id/bell"); //提醒
    public static By task = By.id("com.gongzhidao.inroad:id/task"); //任务
    public static By safetyBehavior = By.xpath("//android.widget.TextView[contains(@text,'人员行为安全')]"); //人员行为安全
    public static By training = By.xpath("//android.widget.TextView[contains(@text,'人员培训')]"); //人员培训
    public static By safetySheet = By.xpath("//android.widget.TextView[contains(@text,'安全作业单')]"); //安全作业单
    public static By abnormityManagment = By.xpath("//android.widget.TextView[contains(@text,'设备仪表异常管理')]"); //设备仪表异常管理
    public static By dailyManagment = By.xpath("//android.widget.TextView[contains(@text,'设备仪表日常管理')]"); //设备仪表日常管理
    public static By coredata = By.xpath("//android.widget.TextView[contains(@text,'关键数据')]"); //关键数据
    public static By equipMaintenance = By.xpath("//android.widget.TextView[contains(@text,'设备维保')]"); //设备维保
    public static By knowledge = By.xpath("//android.widget.TextView[contains(@text,'知识库')]"); //知识库

}
