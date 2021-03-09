package com.myPackage;


public class MinMax<T extends Comparable<T>> {
    T a,b,c;

    public MinMax(T a,T b,T c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public T maximum()
    {
        return  MinMax.maximum(a,b,c);
    }

    public static <T extends Comparable<T>> T maximum(T a, T b, T c)
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
