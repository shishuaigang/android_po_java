package com.inroad.androidTest.page;

import org.openqa.selenium.By;

/**
 * Created by shishuaigang on 2017/6/16.
 * 封装知识库页面上的元素
 */

public class Knowledge {
    public static By browse = By.xpath("//android.widget.TextView[contains(@text,'浏览')]"); //浏览
    public static By collection = By.xpath("//android.widget.TextView[contains(@text,'我的收藏')]"); //我的收藏
    public static By search = By.xpath("//android.widget.TextView[contains(@text,'检索')]"); //检索
}
