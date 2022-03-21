package com.company;

public class BubbleSort implements Sort {
    @Override
    public void executeSort(int[] arr){
        System.out.println("Bubble Sort");

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }}
}