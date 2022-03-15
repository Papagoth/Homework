package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	System.out.println("Branch master2");
	System.out.println("Branch master1 checkout from master");
        List<String> liststr =new ArrayList<>();
        liststr.add("aaa");
        liststr.add("aaa");
        liststr.add("aaa");
        liststr.add("aaa");
        for (int i = 0; i < liststr.size();i++)
        {
            System.out.println(liststr.get(i).charAt(i));
        }
    }
}
