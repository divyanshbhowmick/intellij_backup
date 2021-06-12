package com.divyansh.coding.ACE_DSA1;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {11, 4, 3, 2, 10, 12};
        System.out.print("Initial Array: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
        getNextGreaterElement(arr);
    }

    private static void getNextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int next = arr[i];
            if (!stack.isEmpty()) {
                int element = stack.pop();

                while (element < next) {
                    System.out.print(element + "------->" + next);
                    System.out.println(" Stack is: "+stack);
                    if (stack.isEmpty()) break;
                    element = stack.pop();
                }
                if (element > next) stack.push(element);
            }
            stack.push(next);
        }
        while (!stack.isEmpty()) {
            int element = stack.pop();
            int next = -1;
            System.out.println(element + "------->" + next);
        }
    }
}
