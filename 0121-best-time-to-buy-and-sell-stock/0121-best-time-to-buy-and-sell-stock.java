class Solution {
    public int maxProfit(int[] prices) {
        // int[] left = new int[prices.length];
        // int [] right = new int [prices.length];
        // left[0]=prices[0];
        // right[prices.length-1] = prices[prices.length-1];
        // for(int i=1;i<prices.length;i++){
            
        // }
        int min=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=prices[i];
            }
        else{
            max=Math.max(max,prices[i]-min);
        }
        }
        return max;
    }
}