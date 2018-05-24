package com.jiesean.basesort;

/*
 * 插入排序算法
 *
 * 算法思想：依次将元素插入到有序序列的正确位置上
 * 时间复杂度　O(n*n)
 *
 *
 */

import com.jiesean.Sort;

public class InsertSort extends Sort {

    @Override
    public void sort(int[] nums) {
        super.sort(nums);

        //[0,i]为目前的有序数列
        for(int i = 1;i<nums.length;i++){
            insert(nums,0, i);
        }

    }

    private void insert(int[] nums,int start,int end){

        int value = nums[end];
        int i;
        for(i = end;i >0 && nums[i-1] > value;i--){
//            if(nums[i] < nums[i-1]){
//                int temp = nums[i];
//                nums[i] = nums[i-1];
//                nums[i-1] = temp;
//            }

            //插入排序的改进
            nums[i] = nums[i-1];
        }
        nums[i] = value;
    }
}