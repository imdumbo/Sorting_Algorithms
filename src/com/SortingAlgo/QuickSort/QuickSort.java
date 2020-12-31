package com.SortingAlgo.QuickSort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public QuickSort() {
    }

    public void quickSort(int[] A) {
        this.quickSort(A, 0, A.length - 1);
    }

    private void quickSort(int[] A, int start, int end) {
        if (start < end + 1) {
            int p = this.partition(A, start, end);
            this.quickSort(A, start, p - 1);
            this.quickSort(A, p + 1, end);
        }

    }

    private void swap(int[] A, int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    private int getPivot(int start, int end) {
        Random rand = new Random();
        return rand.nextInt(end - start + 1) + start;
    }

    private int partition(int[] A, int start, int end) {
        this.swap(A, start, this.getPivot(start, end));
        int border = start + 1;

        for(int i = border; i <= end; ++i) {
            if (A[i] < A[start]) {
                this.swap(A, i, border++);
            }
        }

        this.swap(A, start, border - 1);
        return border - 1;
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int[] A = new int[]{56, 787, 767, 4, 5, 38, 878, 62, 1, 0, 4, 3, 2, 9};
        System.out.println(Arrays.toString(A));
        q.quickSort(A);
        System.out.println(Arrays.toString(A));
    }

}
