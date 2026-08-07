class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int lm=height[0],rm=height[n-1];
        int res=0;
        while(l<r){
            if(lm<rm){
                l++;
                lm=Math.max(lm,height[l]);
                res+=lm-height[l];
            }else{
                r--;
                rm=Math.max(rm,height[r]);
                res+=rm-height[r];
            }
        }
        return res;
    }
}
