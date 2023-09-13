package Sorting;

// In selection sort algorithm, we search for the lowest element and arrange it to the proper location.
//swap current element with lowest element

public class SelectionSort {

    public void selection(int arr[]){

        int min;
        for(int i=0;i< arr.length-2;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
