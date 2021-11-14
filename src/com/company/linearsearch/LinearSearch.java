package com.company.linearsearch;

/**
 * 线性查找
 */
public class LinearSearch {

    private LinearSearch() {}

    public static <T> int search(T[] data, T target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int search = search(new String[]{"1","2", "3", "4"}, "2");
        System.out.println(search);
    }
}
