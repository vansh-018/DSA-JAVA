class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxlength = 1;
        int inc = 1;
        int dec = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                inc++;
                dec = 1;
            }
            else if(nums[i]>nums[i+1]){
                dec++;
                inc = 1;
            }
            else if(nums[i]==nums[i+1]){
                inc = 1;
                dec = 1;
            }
            maxlength = Math.max(maxlength,Math.max(inc,dec));
        }
        return maxlength;
    }
}