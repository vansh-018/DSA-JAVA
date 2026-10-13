class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
            }
        }
        Arrays.sort(nums);
        int i = 0;
        int j = n-1;
        long score = 0;
        while(i<j){
            score += (long)(nums[j]*nums[j]);
            j--;
            score -= (long)(nums[i]*nums[i]);
            i++;
        }
        if(i==j){
            score += (long)(nums[i]*nums[j]);
        }
        return score;
    }
}