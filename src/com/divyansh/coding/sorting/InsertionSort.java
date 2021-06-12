package com.divyansh.coding.sorting;

/**
 When to apply insertion sort:
    1) When the user is giving input one by one.
    2) When the array is almost sorted.
 **/



public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {10, 1, 5, 20, 100, 6};
        System.out.println("Initially.......");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
        sort(arr, arr.length);
        System.out.println("-----------------------");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }

    private static void sort(int[] arr, int length) {
        int n = length;
        for (int i = 1; i < n; i++) {
            //The element to be compared (i.e. the first element of unsorted region.)
            int key = arr[i];
            int j = i - 1;
            //We are comparing the current element with the previous elements which are already present.
            while (j >= 0 && arr[j] > key) {
                //Shifts the element in the sorted region to right and makes space for the key (sorted number)
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            //Assign the j+1 position (empty position) to the key.
            arr[j + 1] = key;
            System.out.println(i);
            for (int k = 0; k < arr.length; k++) System.out.print(arr[k] + " ");
            System.out.println();
        }
    }
}
