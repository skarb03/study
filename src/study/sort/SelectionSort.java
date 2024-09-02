package study.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr ={65,67,71,2,99,3,1};
        int size = 7;
        SelectionSort(arr,size);

        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSort(int []arr, int size){

        for(int i = 0;i<size-1;i++){
            int minIdx = i;
            for(int j = i+1;j<size;j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
