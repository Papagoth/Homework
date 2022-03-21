package com.company;


public class Main {


    public static void main(String[] args) {
        int[] arr1 = {3,7,9,1,6,8};
        int[] arr2 = {3,7,9,1,6,8};
        int[] arr3 = {3,7,9,1,6,8};
        CountingSort countingSort = new CountingSort();
        BubbleSort bubbleSort =  new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        SorterStrategy sort1 = new SorterStrategy(countingSort);
        SorterStrategy sort2 = new SorterStrategy(bubbleSort);
        SorterStrategy sort3 = new SorterStrategy(selectionSort);
        sort1.sort.executeSort(arr1);
        System.out.println("arr1");
        for(int i = 0;i < arr1.length;i++)
        {
            System.out.println(" "+arr1[i]+" ");
        }
        sort2.sort.executeSort(arr2);
        System.out.println("arr2");
        for(int i = 0;i < arr2.length;i++)
        {
            System.out.println(" "+arr2[i]+ " ");
        }
        sort3.sort.executeSort(arr3);
        System.out.println("arr3");
        for(int i = 0;i < arr3.length;i++)
        {
            System.out.println(" "+arr3[i]+ " ");
        }


    }

}
