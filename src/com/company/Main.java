package com.company;

import com.company.sort.Inserting;
import com.company.sort.Selecting;
import com.company.util.Example;

public class Main {

    public static void main(String[] args) {
//        Selecting selecting = new Selecting();
        Inserting inserting = new Inserting();
        Integer[] ints = new Integer[]{108, 23, 34, 3, 12, 76, 22, 13};
        test(inserting, ints);
    }

    static void test(Example example,Comparable[] a) {
        example.sort(a);
    }
}
