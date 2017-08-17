package com.inroad.androidTest.common;

import org.openqa.selenium.WebElement;

public class IsElementExist {

    private WebElement e;

    public IsElementExist(WebElement webElement) {
        this.e = webElement;
    }

    public boolean isElementExist() {
        try {
            e.isDisplayed();
            return true;
        } catch (org.openqa.selenium.NoSuchElementException ex) {
            return false;
        }
    }
}
