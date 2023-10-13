package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest
{
    @Test
    public void testlogin1()
    {
        App myapp=new App();
        Assert.assertEquals(0,myapp.userLogin("boby","boby123"));
//        passing incorrect password
    }

    @Test

    public void testlogin2()
    {
        App myapp=new App();
        Assert.assertEquals(1,myapp.userLogin("boby","boby@123"));
    }



}
