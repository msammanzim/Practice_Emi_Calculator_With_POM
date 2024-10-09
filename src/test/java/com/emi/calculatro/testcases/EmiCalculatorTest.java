package com.emi.calculatro.testcases;

import com.emi.calculatro.screens.BaseScreen;
import com.emi.calculatro.screens.EmiCalculatorScreen;
import com.emi.calculatro.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseTest {
    @Test
    public void fillEmiAllField(){
        EmiCalculatorScreen emiCalculatorScreen;
        HomeScreen homeScreen;
        emiCalculatorScreen=screen.getInstance(HomeScreen.class)
                .tapStart()
                .fillAmount(5000)
                .fillInterestrate(8)
                .fillYear(2)
                .fillMonth(2)
                .processFee(3)
                .tapCalculatorBtn();
        Assert.assertTrue(emiCalculatorScreen.hasCalculatorBtn());
    }


}

