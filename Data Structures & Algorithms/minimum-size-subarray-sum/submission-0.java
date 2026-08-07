class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int currsum=0;
        int min=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            currsum+=nums[r];
            while(currsum>=target){
                min=Math.min(min,r-l+1);
                currsum-=nums[l];
                l++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}