class Solution {
    public int missingNumber(int[] nums) {
        int expected_Sum=0;
        int actual_Sum=0;

        for(int i =0;i<nums.length;i++){
            actual_Sum+=nums[i];
        }
        for(int i=0;i<=nums.length;i++){
            expected_Sum+=i;
        }
        
        int missing = expected_Sum-actual_Sum;
        return missing;
    }
}