/*
 * @author Asim Ahammed
 */

package com.bridgelab;

public class InsertionSort {
    // sorting string array by insertion sort
    public static void insertion(String[] ans) {
        for (int i = 0; i < ans.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (ans[j].compareTo(ans[j - 1]) < 0) {// comparing adjust values
                    // swaping adjust values
                    String temp = ans[j];
                    ans[j] = ans[j - 1];
                    ans[j - 1] = temp;
                }
            }
        }
        // printing sorted array
        System.out.println("The ordered list is");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    // main
    public static void main(String[] args) {
        String[] ans = { "Something", "better", "than", "nothing" };
        insertion(ans);
    }
}