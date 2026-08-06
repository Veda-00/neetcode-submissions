class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while(l<r){
           int  val=numbers[l]+numbers[r];
            if(val>target) r--;
            else if(val<target) l++;
            else return new int[]{l+1,r+1};
        }
        return new int[]{};
    }
    //     for(int i=0;i<numbers.length;i++){
    //         int exp=target-numbers[i];
    //         int val=binarySearch(numbers,exp,i+1);
    //         if(val!=-1) return new int[]{i+1,val+1};
    //     }
    //     return new int[]{};

    // }
    // int binarySearch(int[] numbers,int val,int l){
    //     int r=numbers.length-1;
    //     while(l<=r){
    //         int mid=l+(r-l)/2;
    //         if(numbers[mid]<val) l=mid+1;
    //         else if(numbers[mid]>val) r=mid-1;
    //         else return mid;
    //     }
    //     return -1;
    // }
}
