package com.emi.calculatro.testcases;

import com.emi.calculatro.common.General;
import com.emi.calculatro.screens.EmiCalculatorScreen;
import com.emi.calculatro.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeScreenTest extends BaseTest{
    HomeScreen homeScreen;
    EmiCalculatorScreen emiCalculatorScreen;
    @Test
    public void getAppName(){
        homeScreen=screen.getInstance(HomeScreen.class);
        Assert.assertEquals(General.APP_NAME,homeScreen.hasAppName());
    }
    @Test
    public void tapStartBtn(){
        emiCalculatorScreen=screen.getInstance(HomeScreen.class)
                .tapStart();
        Assert.assertTrue(emiCalculatorScreen.hasCalculatorBtn());

    }

}