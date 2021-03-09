package com.myPackage;
import java.lang.Integer;

public class MinMax {

    public Integer checkgreatestint(Integer a ,Integer b,Integer c)
    {
       if( a.compareTo(b)>0 && a.compareTo(c)>0 )
       {
           return a;
       }
       else if (b.compareTo(c)>0)
       {
           return b;
       }
       else
           return c;
    }

    public Double checkgreatestfloat(Double a ,Double b,Double c)
    {
        if( a.compareTo(b)>0 && a.compareTo(c)>0 )
        {
            return a;
        }
        else if (b.compareTo(c)>0)
        {
            return b;
        }
        else
            return c;
    }
}
