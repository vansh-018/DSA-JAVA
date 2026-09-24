class Solution {
    int helper(int x){
        int count = 0;
        while(x!=0){
            int y = x%10;
            count+=y;
            x=x/10;
        }
        return count;
    }
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(helper(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}