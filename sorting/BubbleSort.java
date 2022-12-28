package com.mySpringboot.dataStructure.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {

        for(int i=array.length-1;i>0;i--) {
            for(int j=0; j<i;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]=temp;
                }
            }
        }
//        for(int i=0;i<array.length-1;i++) {
//            for(int j=0; j<array.length-1;j++){
//                if (array[j]>array[j+1]){
//                    int temp = array[j];
//                    array[j]= array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//        }

    }

    public static void main(String[] args) {
        int[] array = {4,3,1,5,6,2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
