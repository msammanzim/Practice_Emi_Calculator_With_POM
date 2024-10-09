package com.emi.calculatro.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen extends BaseScreen{
    public HomeScreen(AndroidDriver driver) {
        super(driver);
    }
    public String hasAppName(){
        waitForElement(By.id("appName"));
        return getWebElement(By.id("appName")).getText().trim();
    }
    public EmiCalculatorScreen tapStart(){
        waitForElement(By.id("btnStart"));
        getWebElement(By.id("btnStart")).click();
        return getInstance(EmiCalculatorScreen.class);
    }
}
