class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currCount = 0;
        int maxCount=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                maxCount = Math.max(maxCount,currCount);
                currCount=0;
              
            }
            else{
                  currCount++;
            }
        }
        return Math.max(currCount,maxCount);
    }
}