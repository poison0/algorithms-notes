package com.company.sort;

import com.company.util.Example;

public class Shell extends Example {

    @Override
    public void sort(Comparable[] a) throws InterruptedException {
        int N = a.length;
        int h = 1;
        while (h < 3 / N) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j],a[j-h]); j-=h) {
                    exch(a, j, j - h);
                }
            }
            h = h/3;
        }
    }
}
