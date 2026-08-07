class Solution {
    public int maxSubArray(int[] nums) {
        int currsum=0;
        int maxsum=nums[0];
        for(int num:nums){
            currsum=Math.max(currsum,0);
            currsum+=num;
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}
