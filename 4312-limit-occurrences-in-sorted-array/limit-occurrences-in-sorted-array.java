class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int j = 0;
        int[] res = new int[n];
        for(int i=0;i<nums.length;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                count = 1;
            }
            else{
                count++;
            }
            if(count<=k){
                res[j]=nums[i];
                j++;
            }
        }
        return Arrays.copyOf(res,j);
    }
}