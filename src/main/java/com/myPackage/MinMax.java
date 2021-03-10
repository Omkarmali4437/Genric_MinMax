package com.myPackage;


import java.util.Arrays;

public class MinMax<T extends Comparable<T>> {

    T [] items;


    @SafeVarargs
    public MinMax(T...items)
    {
        this.items=items;
    }

    public <T extends Comparable<T>> T maximum()
    {
        T max;
        Arrays.sort(items);
        max= (T) items[items.length-1];
        printMaximum(max);
        return max;
    }

    public static <T> void printMaximum(T max)
    {
        System.out.println("Maximum is:  "+max);
    }


 }

