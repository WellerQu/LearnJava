package com.nixon;

import com.practice.P16;
import com.practice.P17;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println(arrayList.size());

        String[] array = {"Hello", "World"};
        System.out.println(array.length);

        P16 p16 = new P16();
        p16 = null;


        P17[] p17Arr = {
            new P17(),
            new P17("Hello")
        };
    }
}
