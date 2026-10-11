class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int[] res = new int[k];
        Arrays.sort(nums);
        int n = nums.length;
        int x = 0;
        for(int i = n-1;i>=0 && x<k;i--){
            if(i==n-1 || nums[i]!=nums[i+1]){
                res[x]=nums[i];
                x++;
            }
        }
        return Arrays.copyOf(res,x);
    }
}