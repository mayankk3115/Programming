package com.mySpringboot.dataStructure.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void quickSortHelper(int[] array, int left, int right) {
        if(left<right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex+1, right);
        }
    }

    public static void quickSort(int[] array) {
        quickSortHelper(array,0, array.length-1);
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for(int i=pivotIndex+1; i<=endIndex; i++) {
            if(array[i]< array[pivotIndex]) {
                swapIndex++;
                swap(array,swapIndex,i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void swap(int[] array, int pivotIndex, int swapIndex) {
        int temp = array[pivotIndex];
        array[pivotIndex] = array[swapIndex];
        array[swapIndex] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4,8,5,2,6,1,3};
        int returnedIndex = pivot(array,0,6);
        //System.out.println("Returned Index:", + returnedIndex);
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
