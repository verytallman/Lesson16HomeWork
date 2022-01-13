package org.homework16;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondTest {

    @BeforeSuite
    public void beforeSuitMethod(){
        System.out.println("This is before suit method.");
    }
    @AfterSuite
    public void afterSuitMethod(){
        System.out.println("This is after suit method.");
    }

    @Test(groups = "regression")
    public void testMeSome3(){
        System.out.println("This is regression first test.");
    }

    @Test(groups = "regression")
    public void testMeSome4(){
        System.out.println("This is regression second test.");


    }

    @Test(groups = "regression")
    public void testMeSome5(){
        System.out.println("This is regression third test.");
    }
}
