package org.homework16;

import org.testng.annotations.*;

public class ThirdTest {
    @BeforeTest
    public void beforeTestMethod(){
        System.out.println("This is before test method.");
    }

    @AfterTest
    public void afterTestMethod(){
        System.out.println("This is after test method.");
    }

    @BeforeClass
    public void beforeClassMethod(){
        System.out.println("This is before class method.");
    }

    @AfterClass
    public void afterClassMethod(){
        System.out.println("This is after class method.");
    }

    @BeforeGroups(groups = {"unit"})
    public void beforeGroups(){
        System.out.println("Before groups method.");
    }

    @AfterGroups(groups = {"unit"})
    public void afterGroups(){
        System.out.println("After groups method.");
    }

    @Test(groups = "unit")
    public void testMeSome6(){
        System.out.println("This is unit first test.");
    }

    @Test(groups = "unit")
    public void testMeSome7(){
        System.out.println("This is unit second test.");

    }

    @Test(groups = "unit")
    public void testMeSome8(){
        System.out.println("This is unit third test.");
    }

}
