package com.myPackage;
import java.lang.Integer;

public class MinMax {

    public Integer checkgreatestint(Integer num1 ,Integer num2,Integer num3)
    {
       if( num1.compareTo(num2)>0 && num1.compareTo(num3)>0 )
       {
           return num1;
       }
       else if (num2.compareTo(num3)>0)
       {
           return num2;
       }
       else
       {
           return num3;
       }
    }

    public Double checkgreatestfloat(Double float1 ,Double float2,Double float3)
    {
        if( float1.compareTo(float2)>0 && float1.compareTo(float3)>0 )
        {
            return float1;
        }
        else if (float2.compareTo(float3)>0)
        {
            return float2;
        }
        else
        {
            return float3;
        }
    }

    public String checkgreateststring(String string1 ,String string2,String string3)
    {
        if( string1.compareTo(string2)>0 && string1.compareTo(string3)>0 )
        {
            return string1;
        }
        else if (string2.compareTo(string3)>0)
        {
            return string2;
        }
        else
        {
            return string3;
        }
    }
}
