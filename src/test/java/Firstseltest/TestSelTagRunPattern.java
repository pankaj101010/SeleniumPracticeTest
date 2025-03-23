package Firstseltest;

import org.testng.annotations.*;

public class TestSelTagRunPattern {

    @BeforeSuite
    public void tc_01() {
        System.out.println("before suit");
    }

    @BeforeTest
    public void tc_02() {
        System.out.println("before Test");
    }

    @BeforeClass
    public void tc_03() {
        System.out.println("before Class");
    }

    @BeforeMethod
    public void tc_04() {
        System.out.println("before Method");
    }

    @BeforeGroups(groups ={"pankaj"})
    public void tc_g(){
        System.out.println("Before group");
    }

    @AfterSuite
    public void tc_05() {
        System.out.println("After suit");
    }

    @AfterTest
    public void tc_06() {
        System.out.println("After Test");
    }

    @AfterClass
    public void tc_07() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void tc_08() {
        System.out.println("After Method");
    }

    @AfterGroups(groups ={"pankaj"})
    public void tc_09() {
        System.out.println("After Groupt");
    }

    @Test(groups ={"pankaj"})
    public void tc_090() {
        System.out.println("Test method1 ");
    }


    @Test(groups ={"pankaj"})
    public void tc_0909() {
        System.out.println("Test method2 ");
    }
}
