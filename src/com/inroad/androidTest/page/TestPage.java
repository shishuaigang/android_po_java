package com.inroad.androidTest.page;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TestPage {

    @AndroidFindBy(id="com.gongzhidao.inroad:id/switch_btn")
    public static AndroidElement switchbtn;

    @AndroidFindBy(id="com.gongzhidao.inroad:id/personal")
    public static AndroidElement personal;

}
