package com.SortingAlgo.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public InsertionSort() {
    }

    static void sort(int[] a) {
        int n = a.length;

        for(int i = 1; i < n; ++i) {
            int key = a[i];

            int j;
            for(j = i - 1; j >= 0 && a[j] > key; --j) {
                a[j + 1] = a[j];
            }

            a[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{64, 25, 12, 22, 11};
        System.out.println("Unsorted Array : " + Arrays.toString(a));
        sort(a);
        System.out.println("Sorted Array : " + Arrays.toString(a));
    }
}
