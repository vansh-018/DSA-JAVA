class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max_count=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                if(max_count < count){
                    max_count = count;
                }
                count=0;
            }
            else if(nums[i]==1){
                count++;
            }
        }
        if(max_count < count){
            max_count = count;
        }
        return max_count;
    }
}