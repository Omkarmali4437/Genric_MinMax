package com.myPackage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class MinMaxTest {

    @Test
    public void given_integers_check_maximum()
    {
        MinMax<Integer> max=new MinMax<>(60,70,80,90,100);
        int result=max.maximum();
        Assert.assertEquals(100,result);
    }

    @Test
    public void given_float_check_maximum()
    {
        MinMax<Double> max=new MinMax<>(60.13,70.99,80.44,90.8887,10.2);
        double result=max.maximum();
        Assert.assertEquals(90.8887,result,1e-15);
    }

    @Test
    public void given_strings_check_maximum()
    {
        MinMax<String> max=new MinMax<>("Omkar","Fred","Surendra","Sumit","Mahesh");
        String result=max.maximum();
        Assert.assertEquals("Surendra",result);
    }

}
