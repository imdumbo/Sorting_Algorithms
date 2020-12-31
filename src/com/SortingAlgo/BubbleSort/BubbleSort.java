package com.SortingAlgo.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public BubbleSort() {
    }

    static void sort(int[] a) {
        int n = a.length;

        for(int i = 0; i < n - 1; ++i) {
            for(int j = 0; j < n - i - 1; ++j) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{28, 26, 76, 98, 1, 56};
        System.out.println("Unsorted Array : " + Arrays.toString(a));
        sort(a);
        System.out.println("Sorted Array : " + Arrays.toString(a));
    }
}
