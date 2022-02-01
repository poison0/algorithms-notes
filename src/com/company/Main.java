package com.company;

import com.company.sort.Inserting;
import com.company.sort.Selecting;
import com.company.sort.Shell;
import com.company.util.Example;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Example example = new Selecting();
//        Example example = new Inserting();
        Example example = new Shell();
        Integer[] ints = new Integer[]{108, 23, 34, 3, 12, 76, 22, 13};
        test(example, ints);
    }

    static void test(Example example,Comparable[] a) throws InterruptedException {
        example.sort(a);
        example.show(a);
    }
}
