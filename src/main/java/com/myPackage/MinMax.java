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
        Arrays.sort(items);
        return (T) items[items.length-1];
    }


 }

