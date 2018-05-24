package com.jiesean.sort;

import com.jiesean.helper.Helper;

public class Main {

    public void testSort(Sort s, int[] nums){
        s.sort(nums);
        s.printResult();
    }

    public static void main(String[] args){
        Main main = new Main();
//        int[] nums = {11,1,27,12,34,5,63,6,66,7};
        int[] nums = Helper.generateRandomNums(15);


        //1.测试选择排序
//        Sort selectionSort = new SelectionSort();
//        main.testSort(selectionSort,nums);

        //1.测试插入排序
        Sort insertSort = new InsertSort();
        main.testSort(insertSort,nums);

//        //1.测试冒泡排序
//        Sort bubbleSort = new BubbleSort();
//        main.testSort(bubbleSort,nums);
    }
}
