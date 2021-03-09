package com.myPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinMaxTest {

    @Test
    public void greatest_at_first()
    {
        int result= (int) new MinMax(15,10,5).maximum();
        Assert.assertEquals(15,result);
    }

    @Test
    public void greatest_at_second()
    {
        int result=(int) new MinMax(5,20,15).maximum();
        Assert.assertEquals(20,result);
    }

    @Test
    public void greatest_at_third()
    {
        int result=(int) new MinMax(5,10,15).maximum();
        Assert.assertEquals(15,result);
    }

    @Test
    public void greatest_float_at_first()
    {
        double result=(double) new MinMax(9.1,3.1,5.2).maximum();
        Assert.assertEquals(9.1,result,1e-15);
    }

    @Test
    public void greatest_float_at_second()
    {
        double result=(double) new MinMax(3.1,9.1,5.2).maximum();
        Assert.assertEquals(9.1,result,1e-15);
    }

    @Test
    public void greatest_float_at_third()
    {
        double result=(double) new MinMax(2.1,3.1,8.2).maximum();
        Assert.assertEquals(8.2,result,1e-15);
    }

    @Test
    public void greatest_string_at_first()
    {
        String result=(String) new MinMax("Omkar","Fred","Deva").maximum();
        Assert.assertEquals("Omkar",result);
    }

    @Test
    public void greatest_string_at_second()
    {
        String result=(String) new MinMax("Omkar","Tanmay","Sumit").maximum();
        Assert.assertEquals("Tanmay",result);
    }

    @Test
    public void greatest_string_at_third()
    {
        String result=(String) new MinMax("Omkar","Adwait","Surendra").maximum();
        Assert.assertEquals("Surendra",result);
    }

}
