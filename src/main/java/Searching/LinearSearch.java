package Searching;

public class LinearSearch {

    public int linear(int arr[],int key){
        if(arr.length<0){
            return -1;
        }

        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
