package study;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {44,22,11,43,99,14};
        int size = 6;
        insertionSort(arr,size);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int []arr , int size){
        int i,j,temp;
        for(i =1 ;i < size;i++){
            temp = arr[i];
            for(j = i ; j>0 && arr[j-1]>temp;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;

//            for(int j = i-1; j >=0 ; j--){
//                if(temp > arr[j]){
//                    arr[j+1] = temp;
//                    temp = arr[j];
//                } else if (temp < arr[j]){
//                    arr[j+1] = arr[j];
//                    if(j==0)
//                        arr[j] = temp;
//                }
//           }
        }

    }
}
