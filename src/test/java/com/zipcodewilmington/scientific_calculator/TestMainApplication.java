package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainApplication {

    @Test
    public void getFirstNumberTest1(){
        MainApplication main1 = new MainApplication();
        assertEquals( 1.0, MainApplication.getFirstNumber("1 + 3"), 0);
    }

    @Test
    public void getFirstNumberTest2(){
        MainApplication main1 = new MainApplication();
        assertEquals( 100.0, MainApplication.getFirstNumber("100 + 3"), 0);
    }

    @Test
    public void getSecondNumberTest1(){
        MainApplication main1 = new MainApplication();
        assertEquals( 3.0, MainApplication.getSecondNumber("100 + 3"), 0);
    }

    @Test
    public void getSecondNumberTest2(){
        MainApplication main1 = new MainApplication();
        assertEquals( 100.0, MainApplication.getSecondNumber("100 + 100"), 0);
    }

    @Test
    public void getOperatorTest1(){
        MainApplication main1 = new MainApplication();
        assertEquals( "+", MainApplication.getOperator("100 + 3"));
    }

    @Test
    public void getOperatorTest2(){
        MainApplication main1 = new MainApplication();
        assertEquals( "/", MainApplication.getOperator("100 / 3"));
    }

    @Test
    public void additionTest1(){
        MainApplication main1 = new MainApplication();
        assertEquals( 8, MainApplication.addition(3, 5));
    }

    @Test
    public void additionTest2(){
        MainApplication main1 = new MainApplication();
        assertEquals( 100.25, MainApplication.addition(100.0, 0.25));
    }

    @Test
    public void subtractTest1(){
        MainApplication main1 = new MainApplication();
        assertEquals( 95, MainApplication.subtract(100, 5));
    }
    @Test
    public void subtractTest2(){
        MainApplication main1 = new MainApplication();
        assertEquals( 95, MainApplication.subtract(95.25, 0.25));
    }

    @Test
    public void multiplyTest1(){
        MainApplication main1 = new MainApplication();
        assertEquals( 100, MainApplication.multiply(10, 10));
    }

    @Test
    public void multiplyTest2(){
        MainApplication main1 = new MainApplication();
        assertEquals( 25, MainApplication.multiply(5, 5));
    }

    @Test
    public void divideTest1(){
        MainApplication main1 = new MainApplication();
        assertEquals( 1, MainApplication.divide(5, 5));
    }

    @Test
    public void divideTest2(){
        MainApplication main1 = new MainApplication();
        assertEquals( -10, MainApplication.divide(100, -10));
    }

}