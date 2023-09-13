package Sorting;

import java.util.Arrays;
//Merge sort is a recursive divide and conquer algorithm that divides a given array into two halves,
// sorts those halves, and merges them together in order.
public class MergeSort {

    public void divide(int arr[]){

        if (arr == null || arr.length <= 1) {
            return;
        }
        int mid=arr.length/2;
        int[] left= Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,arr.length);

        divide(left);
        divide(right);
        merge(arr,left,right);
    }

    public void merge(int[] arr,int[] left,int[] right){
        int i=0,j=0,k=0;

        while(i<left.length && j< right.length){
            if(left[i]>right[j]){
                arr[k++]=right[j++];
            }
            else{
                arr[k++]=left[i++];
            }
        }
        while(i< left.length){
            arr[k++]=left[i++];
        }

        while(j<right.length){
            arr[k++]=right[j++];
        }
    }
}
