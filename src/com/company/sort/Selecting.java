package com.company.sort;

import com.company.util.Example;

/**
 * 选择排序
 */
public class Selecting extends Example {
    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(less(a[j],a[min])){
                    min = j;
                }
                exch(a,i,min);
            }
        }
        show(a);
    }
}
