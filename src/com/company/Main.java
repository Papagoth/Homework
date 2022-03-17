package com.company;

import java.util.LinkedList;
import java.util.concurrent.Callable;

public class Main {


    public static void main(String[] args)
    {
        List<Integer> list =new List<>();
        list.add(132);
        list.add(12);
        list.add(132);
        list.add(12);
        list.add(132);
        list.add(12);
        list.replace(3,1000);
        System.out.println(list.get(3));

    }

}
