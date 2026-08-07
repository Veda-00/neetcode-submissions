class Solution {
    public int search(int[] nums, int target) {
        int piv=pivot(nums);
        int res=bs(nums,target,0,piv-1);
        if(res!=-1) return res;
        return bs(nums,target,piv,nums.length-1);
    }
    int pivot(int[] nums){
        int s=0;int e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[e]) s=mid+1;
            else e=mid;
        }
        return s;
    }
    int bs(int[] arr,int target,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<target) s=mid+1;
            else if(arr[mid]>target) e=mid-1;
            else return mid;
        }
        return -1;
    }
}
