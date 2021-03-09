package com.myPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinMaxTest {
    MinMax minmax;

    @Before
    public void setup() throws Exception
    {
        minmax=new MinMax();
    }

    @Test
    public void greatest_at_first()
    {
        int result=minmax.checkgreatest(15,10,5);
        Assert.assertEquals(15,result);
    }

    @Test
    public void greatest_at_second()
    {
        int result=minmax.checkgreatest(10,20,5);
        Assert.assertEquals(20,result);
    }

    @Test
    public void greatest_at_third()
    {
        int result=minmax.checkgreatest(5,10,15);
        Assert.assertEquals(15,result);
    }
}
