package com.jiesean.advancesort;

import com.jiesean.Sort;


/**
 * 归并排序
 *
 * 
 * 时间复杂度：O(nlogn)
 *
 *
 */
public class MergeSort  extends Sort {

    @Override
    public void sort(int[] nums) {
        super.sort(nums);
        mergeSort(nums,0,nums.length-1);
    }

    private void mergeSort(int[] nums,int start, int end){

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(nums, start, mid);
            mergeSort(nums, mid + 1, end);
            merge(nums,start,mid,end);
        }
    }
    private void merge(int[] nums,int start,int mid,int end){
        int[] temp =new  int[end - start + 1];
        int r = start;
        int l = mid + 1;
        for (int j = 0; j < temp.length; j++) {
            if(r>mid){
                temp[j] =nums[l];
                l++;
            }
            else if(l>end){
                temp[j] = nums[r];
                r++;
            }
            else if (nums[r] <= nums[l]) {
                temp[j] = nums[r];
                r++;
            } else {
                temp[j] = nums[l];
                l++;
            }
        }

        for (int i = start; i < (start + end - start + 1); i++) {
            nums[i] = temp[i-start];
        }
    }
}
