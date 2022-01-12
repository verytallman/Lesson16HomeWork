package org.homework16;

import org.testng.annotations.*;

public class FirstTest {
    
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("Before group method.");
    }

    @BeforeGroups
    public void afterGroups(){
        System.out.println("After group method.");
    }

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("This is before method.");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.println("This is after method.");
    }


    @Test(groups = "smoke")
    public void testMeSome(){
        System.out.println("This is smoke first test.");
    }

    @Test(groups = "smoke")
    public void testMeSome1(){
        System.out.println("This is smoke second test.");


    }

    @Test(groups = "smoke")
    public void testMeSome2(){
        System.out.println("This is smoke third test.");
    }
}

