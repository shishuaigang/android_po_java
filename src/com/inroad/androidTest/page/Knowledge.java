package com.inroad.androidTest.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by shishuaigang on 2017/6/16.
 * 封装知识库页面上的元素
 */

public class Knowledge {

    @FindBy(xpath="//android.widget.TextView[contains(@text,'浏览')]") //浏览
    public static WebElement browse;

    @FindBy(xpath="//android.widget.TextView[contains(@text,'我的收藏')]") //我的收藏
    public static WebElement collection;

    @FindBy(xpath="//android.widget.TextView[contains(@text,'检索')]") //检索
    public static WebElement search;
}
