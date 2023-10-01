package LeetCode;

public class Pattern {
		public static boolean find123Pattern(int[] nums) {
			int n = nums.length;
			int left = nums[0];
			for(int j=1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(nums[k]>left && nums[j]>nums[k]) 
						return true;
					
				}
				left = Math.min(nums[j],left);
			}
			return false;
			
		}
		public static void main(String[] args) {
				int nums[] = {1,2,3,4};
				System.out.println(find123Pattern(nums));
		}
}
