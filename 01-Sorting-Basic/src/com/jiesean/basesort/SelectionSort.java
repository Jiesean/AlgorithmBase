package com.jiesean.basesort;
/*
 * 选择排序算法
 *
 * 算法思想：依次找到最小的元素，排在队列的最后面
 * 时间复杂度为O(n~2)
 * 如果我们将寻找最小值的方法改为二分查找，那么时间复杂度将变为O(nlogn)
 *
 */

import com.jiesean.Sort;

public class SelectionSort extends Sort {

    @Override
    public void sort(int[] nums) {
        super.sort(nums);

        //[i,nums.length)区间中的最小值
        int tempMin;
        //[0,i)为有序序列
        for(int i = 0; i < nums.length; i++){
            tempMin = nums[i];
            for(int j = i; j<nums.length; j++ ){
                if(tempMin > nums[j]){
                    int temp = tempMin;
                    tempMin  = nums[j];
                    nums[j] = temp;
                }
            }
            nums[i] = tempMin;
        }
    }

}