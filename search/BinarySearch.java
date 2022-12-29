package com.programming.datastructure.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {2,3,4,5,9,11};
        int value = 9;
        int low=0;
        int high=array.length-1;
        int result = binarySearchRecursive(array,value,low,high);
        if (result==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index:" + result);
        }

    }


    //Iterative
    private static int binarySearchIterative(int[] array, int value, int low ,int high) {
        while(low<high) {
            int mid = (low+high)/2;
            if (array[mid]==value) {
                return mid;
            }
            if (array[mid]<value){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] array, int value, int low ,int high) {
        if(high >= low) {
            int mid = (low+high)/2;
            if (array[mid]==value){
                return mid;
            }
            if(array[mid]>value){
                return binarySearchRecursive(array,value,low,mid);
            }else{
                return binarySearchRecursive(array,value,mid+1,high);
            }
        }
        return -1;
    }
}
