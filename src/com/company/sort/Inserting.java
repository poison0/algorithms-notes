package com.company.sort;

import com.company.util.Example;

/**
 * 插入排序
 */
public class Inserting extends Example {

    @Override
    public void sort(Comparable[] a) throws InterruptedException {

        for (int i = 1; i < a.length; i++) {
            for(int j = i;j>0 && less(a[j],a[j-1]);j--){
                exch(a,j,j-1);
            }
        }
        show(a);
    }
}
