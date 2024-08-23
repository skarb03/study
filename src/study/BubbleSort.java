package study;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={6,1,2,5,8,9};
        int size = 5;
        bubbleSort(arr, size);

        for(int nums :  arr){
            System.out.print(" "+nums);
        }
    }

    static void bubbleSort(int[] arr,int size){

        for(int i = 0; i < size; i++){
            for (int j = 1; j < size-i; j++) {
                int prev = arr[j-1];
                int cur = arr[j];

                if(prev > cur ){
                    arr[j]=prev;
                    arr[j-1] = cur;
                }
            }
        }
    }
}
