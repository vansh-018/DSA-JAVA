class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int min[] = new int[n];
        min[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            min[i]=Math.min(nums[i],min[i+1]);
        }
        for(int i=1;i<n;i++){
            nums[i]=Math.max(nums[i],nums[i-1]);
        }
        for(int i=0;i<n;i++){
            int instability=nums[i]-min[i];
            if(instability<=k){
                return i;
            }
        }
        return -1;
    }
}