package Sorting;

//It works by comparing adjacent pairs of elements and swapping them if they are in the wrong order.
public class BubbleSort {

    public void bubble(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
