package com.emi.calculatro.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class EmiCalculatorScreen extends BaseScreen {
    public EmiCalculatorScreen(AndroidDriver driver) {
        super(driver);
    }
    public boolean hasCalculatorBtn(){
        waitForElement(By.id("btnCalculate"));
       return getWebElements(By.id("btnCalculate")).size()>0;
    }
    public EmiCalculatorScreen fillAmount(float amount){
        waitForElement(By.id("etLoanAmount"));
        getWebElement(By.id("etLoanAmount")).sendKeys(String.valueOf(amount));
        return this;
    }
    public EmiCalculatorScreen fillInterestrate(float interest){
        waitForElement(By.id("etInterest"));
        getWebElement(By.id("etInterest")).sendKeys(String.valueOf(interest));
        return this;
    }
    public EmiCalculatorScreen fillYear(int year){
        waitForElement(By.id("etYears"));
        getWebElement(By.id("etYears")).sendKeys(String.valueOf(year));
        return this;
    }
    public EmiCalculatorScreen fillMonth(int month){
        waitForElement(By.id("etMonths"));
        getWebElement(By.id("etMonths")).sendKeys(String.valueOf(month));
        return this;
    }
    public EmiCalculatorScreen processFee(float fee){
        waitForElement(By.id("etFee"));
        getWebElement(By.id("etFee")).sendKeys(String.valueOf(fee));
        return this;
    }
    public EmiCalculatorScreen tapCalculatorBtn(){

        waitForElement(By.id("btnCalculate"));
        getWebElement(By.id("btnCalculate")).click();
        return this;
    }

}
