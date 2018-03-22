package com.learning.interviewcake;

/**
 * You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
 * For example, given:  [1, 7, 3, 4]
 * your method would return: [84, 12, 28, 21]
 * by calculating:[7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
 */
//TODO unfinished
public class ElementsProduct {

    public static void main(String args[]) {
        int[] a = {1, 7, 3, 4};
        int b[] = getProductsOfAllIntsExceptAtIndex(a);
    }

    private static int[] getProductsOfAllIntsExceptAtIndex(int[] a) {
        int[] b = new int[a.length];
        int prevPrd = 1;
        int nextProd = 0;

        if (a.length < 2) {
            b[0] = a[0];
            return b;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (i != 0) {
                    getProducts(0, i,a);
                    getProducts(i + 1, a.length,a);
                } else {
                    //b[i] = a[i] *
                }
            }
        }
        return b;
    }

    private static void getProducts(int i, int i1,int []a) {


    }
}
