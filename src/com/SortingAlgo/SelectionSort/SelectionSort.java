package com.SortingAlgo.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public SelectionSort() {
    }

    static void sort(int[] a) {
        int n = a.length;

        for(int i = 0; i < n - 1; ++i) {
            int min_idx = i;

            int j;
            for(j = i + 1; j < n; ++j) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }

            j = a[min_idx];
            a[min_idx] = a[i];
            a[i] = j;
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{99, 7, 56, 32, 75};
        System.out.println("Unsorted Array : " + Arrays.toString(a));
        sort(a);
        System.out.println("Sorted Array : " + Arrays.toString(a));
    }

}
