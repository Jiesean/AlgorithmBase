package com.jiesean.helper;

import java.util.Random;

/**
 * Hepler类
 * 生成随机数组
 *
 *
 *
 */
public class Helper{
    public Helper(){}

    //生成个数为n的随机数组，其中每个数小于1000
    public static int[] generateRandomNums(int n){
        int[] nums = new int[n];
        Random rand = new Random();
        for(int i = 0; i < n; i++){
            nums[i] = rand.nextInt(200);
        }
        System.out.print("生成的序列是：[");
        for(int i = 0;i<nums.length;i++){
            if(i == nums.length -1){
                System.out.print(nums[i]);
                break;
            }
            System.out.print(nums[i] + ",");
        }
        System.out.print("]\n");
        return nums;
    }

}