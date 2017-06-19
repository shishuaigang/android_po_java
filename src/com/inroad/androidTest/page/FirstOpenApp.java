package com.inroad.androidTest.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FirstOpenApp {

    @FindBy(id="com.gongzhidao.inroad:id/input_code_numbers_layout") //客户代码输入框
    public static WebElement usercode;
}
