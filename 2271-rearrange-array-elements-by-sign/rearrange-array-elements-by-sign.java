class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int x = 0;
        int y = 1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                res[y]=nums[i];
                y=y+2;
            }
            else{
                res[x]=nums[i];
                x=x+2;
            }
        }
        return res;
        
    }
}