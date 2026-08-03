class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int minval=Integer.MAX_VALUE;
        for(int i:prices){
            minval=Math.min(i,minval);
            if(i-minval>max) max=i-minval;
        }
        return max;
    }
}
