package com.myPackage;


public class MinMax {

    public <T extends Comparable<T>> T maximum(T a, T b, T c)
    {
        if(a.compareTo(b)>0 && a.compareTo(c)>0 )
        {
            return a;
        }
        else if (b.compareTo(c)>0)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
}
