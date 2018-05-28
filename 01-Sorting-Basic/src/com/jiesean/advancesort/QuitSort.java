package com.jiesean.advancesort;

import com.jiesean.Sort;

import java.util.Random;


/**
 * 快速排序
 *
 *
 * 当选择标定点为第一个元素时，当去排序近乎有序的数组时，时间复杂度会退化为O(n*2)
 * 改进为变定点的选择元素为任意的位置，其时间复杂度的期待值为O(nlogn)
 *
 *
 */
public class QuitSort  extends Sort {

    @Override
    public void sort(int[] nums) {
        super.sort(nums);

        quitSort(nums, 0, nums.length -1);

    }

    private void quitSort(int[] nums, int start, int end){
        if(start >= end) return;

        int partValue = partition(nums, start, end);
        quitSort(nums, start,partValue-1);
        quitSort(nums,partValue+1,end);
    }

    private int partition(int[] nums, int start, int end){
        int j= start;//[0,j] 为小于等于选定元素的区间
        Random rand = new Random();
        int index = start + rand.nextInt(end-start);
        int temp ;

        for(int i =start;i<=end;i++){
            if(nums[i] <= nums[index]){
                if(nums[i] != nums[j+1]){
                    temp = nums[i];
                    nums[i] = nums[j+1];
                    nums[j+1] = temp;
                }
                j++;
            }
        }
        return j;
    }

}
