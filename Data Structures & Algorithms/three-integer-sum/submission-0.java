class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        Arrays.sort(nums);
         
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[0]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l=i+1,r=n-1;
            while(l<r){
                int target=nums[i]+nums[l]+nums[r];
                if(target>0) r--;
                else if(target<0) l++;
                else {
                    arr.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r && nums[l-1]==nums[l]){
                        l++;
                    }
                }
            }
        }
        return arr;
    }
}
