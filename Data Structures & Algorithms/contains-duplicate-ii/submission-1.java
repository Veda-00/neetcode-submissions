class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j] && Math.abs(i-j)<=k) return   true;
        //     }
        // }
        Set<Integer> win=new HashSet<>();
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(r-l>k){
                win.remove(nums[l]);
                l++;
            }
            if(win.contains(nums[r])) return true;
            win.add(nums[r]);
        }
        return false;
    }
}