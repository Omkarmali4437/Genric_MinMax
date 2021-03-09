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
        int result=minmax.checkgreatestint(15,10,5);
        Assert.assertEquals(15,result);
    }

    @Test
    public void greatest_at_second()
    {
        int result=minmax.checkgreatestint(10,20,5);
        Assert.assertEquals(20,result);
    }

    @Test
    public void greatest_at_third()
    {
        int result=minmax.checkgreatestint(5,10,15);
        Assert.assertEquals(15,result);
    }

    @Test
    public void greatest_float_at_first()
    {
        double result=minmax.checkgreatestfloat(9.1,3.1,5.2);
        Assert.assertEquals(9.1,result,1e-15);
    }

    @Test
    public void greatest_float_at_second()
    {
        double result=minmax.checkgreatestfloat(9.1,11.3,6.5);
        Assert.assertEquals(11.3,result,1e-15);
    }

    @Test
    public void greatest_float_at_third()
    {
        double result=minmax.checkgreatestfloat(5.4,6.7,9.4);
        Assert.assertEquals(9.4,result,1e-15);
    }

}
