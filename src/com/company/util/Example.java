package com.company.util;

public abstract class Example {

    public abstract void sort(Comparable[] a);

    /**
     * 比较两个方法
     */
    protected boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换数组的位置
     */
    protected void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 打印数组
     */
    protected void show(Comparable[] a) {
        for (Comparable c :
                a) {
            System.out.println(c + " ");
        }
    }

    /**
     * 测试数组是否有序
     */
    protected boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
