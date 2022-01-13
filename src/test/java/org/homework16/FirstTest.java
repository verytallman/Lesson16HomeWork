package org.homework16;

import org.testng.annotations.*;

public class FirstTest {

    @DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"First passing with using DataProvider"}, {"Second passing with using DataProvider"}};
    }

    @BeforeMethod
    public void beforeMethod (){
        System.out.println("This is before method.");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.println("This is after method.");
    }


    @Test(groups = "smoke", dataProvider = "data-provider")
    public void testMeSome(String str){
        System.out.println("This is smoke first test. "+ str);
    }

    @Test(groups = "smoke", dataProvider = "data-provider")
    public void testMeSome1(String str){
        System.out.println("This is smoke second test.");
    }

    @Test(groups = "smoke", dataProvider = "data-provider")
    public void testMeSome2(String str){
        System.out.println("This is smoke third test.");
    }
}

