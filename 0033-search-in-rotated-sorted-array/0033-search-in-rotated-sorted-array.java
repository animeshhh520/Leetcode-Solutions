class Solution {
    public int search(int[] nums, int target) {
               int m=0;
               for(int i=0;i<nums.length;i++){
                if(nums[i]==target){
                    m=i;
                    break;
                }
                else{
                    m=-1;
                }
               }return m;
    }
}