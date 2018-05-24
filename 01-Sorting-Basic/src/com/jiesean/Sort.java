package com.jiesean;

public abstract class Sort {
    int[] nums;
    public void sort(int[] nums){
        this.nums = nums;
    };
    public void printResult(){
        System.out.print(this.getClass().getName()+"排序完成后的结果是：[");
        for(int i = 0;i<nums.length;i++){
            if(i == nums.length -1){
                System.out.print(nums[i]);
                break;
            }
            System.out.print(nums[i] + ",");
        }
        System.out.print("]\n");

    }
}
