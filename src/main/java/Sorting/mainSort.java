package Sorting;

import java.util.Arrays;

public class mainSort {

    public static void main(String[] args) {

        MergeSort sort=new MergeSort();
        int arr[]={4,6,1,9,8};
        sort.divide(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
