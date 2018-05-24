package com.jiesean;

import com.jiesean.advancesort.MergeSort;
import com.jiesean.basesort.BubbleSort;
import com.jiesean.helper.Helper;

public class Main {

    public void testSort(Sort s, int[] nums){
        s.sort(nums);
        s.printResult();
    }

    public static void main(String[] args){
        Main main = new Main();
//        int[] nums = {4,24,43,61,65,82,102,103,113,132,140,142,149,165,170};
        int[] nums = Helper.generateRandomNums(15);


        //1.测试选择排序
//        Sort selectionSort = new SelectionSort();
//        main.testSort(selectionSort,nums);

        //1.测试插入排序
//        Sort insertSort = new InsertSort();
//        main.testSort(insertSort,nums);

        //1.测试冒泡排序
//        Sort bubbleSort = new BubbleSort();
//        main.testSort(bubbleSort,nums);

        MergeSort mergeSort = new MergeSort();
        main.testSort(mergeSort,nums);

    }
}
