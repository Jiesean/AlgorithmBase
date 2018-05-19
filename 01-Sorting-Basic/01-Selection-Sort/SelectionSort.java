
/*
 * 选择排序算法
 *  
 * 算法思想：每次找到最小的元素，排在最前面
 *
 */

public class SelectionSort{
	public  static void sort(int[] nums){
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
		// printNums(nums);

	}

	// private void printNums(int[] nums){
		
	// }


	public static void main(String[] args){
		int[] nums = {12,23,1,3,23,11,45,2,4,24,87,25,123};
		SelectionSort.sort(nums);
		for(int i = 0; i < nums.length; i++){
			System.out.println("第"+i+"个元素："+nums[i]);
		}
	}

}