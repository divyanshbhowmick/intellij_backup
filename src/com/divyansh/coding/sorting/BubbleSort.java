package com.divyansh.coding.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {10, 1, 5, 20, 100, 6};
        sort(arr, arr.length);
        System.out.println("-----------------------");
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }

    public static void sort(int arr[], int len) {
        int n = len;
        //Max number of iterations required is n-1
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println(i);
            for (int k = 0; k < arr.length; k++) System.out.print(arr[k] + " ");
            System.out.println();
        }
    }
}
