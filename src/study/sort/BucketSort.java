package study.sort;

import java.util.Arrays;

public class BucketSort {
    public static void main(String[] args) {
        int []arr={3,2,1,1,5,4,3,2,1,1};
        int size = 10;
        int range = 5;
        bucketSort(arr,size,range);

        System.out.println(Arrays.toString(arr));
    }

    static void bucketSort(int []arr,int size , int range ){
        int []bucket = new int[6];
        for(int i = 0 ;i <size;i++){
            bucket[arr[i]]++;
        }
        int index = 0;
        for(int i =1; i <=range;i++){
            while(bucket[i]>0){
                arr[index]=i;
                bucket[i]--;
                index++;
            }
        }
    }
}
