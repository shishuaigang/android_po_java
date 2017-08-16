package com.inroad.androidTest.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CustomerCode {

    //客户代码输入框,首次打开app出现
    @FindBy(id = "com.gongzhidao.inroad:id/input_code_numbers_layout")
    public static WebElement usercode_1;

    //客户代码输入框,长时间不使用app后出现的
    @FindBy(xpath = "//android.widget.TextView[contains(@text,'请输入客户代码')]")
    public static WebElement usercode_2;
}
