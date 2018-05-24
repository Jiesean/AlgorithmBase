package com.jiesean.sort;
/*
 * 冒泡排序算法
 *
 * 算法思想：依次进行n趟比较，将最大的值放在数组的末尾
 * 时间复杂度为O(n~2)
 *
 *
 */

public class BubbleSort extends Sort{

    @Override
    public void sort(int[] nums) {
        super.sort(nums);

        //[i,nums.length)区间为最大序列
        int temp;

        for(int i = nums.length -1; i >=0; i--){
            for(int j =0;j< i;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

            }
        }
    }

}