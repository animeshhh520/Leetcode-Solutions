class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        if(nums.length==1)return nums[0];
        else{
        for(int i=1;i<nums.length;i++){
            min= Math.min(min,nums[i]);
        }
        return min;
        }
    }
}