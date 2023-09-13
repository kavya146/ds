package Sorting;


//The array is virtually split into a sorted and an unsorted part.
// Values from the unsorted part are picked and placed at the correct position in the sorted part.
public class InsertionSort {

    public void insertion(int arr[]){
        int key,j;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[i+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;
        }
    }
}

