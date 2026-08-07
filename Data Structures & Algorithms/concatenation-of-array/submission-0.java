class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] narr=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            narr[i]=nums[i];
            narr[i+nums.length]=nums[i];
        }
        return narr;
    }
}