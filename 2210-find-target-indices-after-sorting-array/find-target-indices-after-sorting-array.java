class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l = new ArrayList<>();
        int smaller = 0;
        int equal = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                smaller++;
            }
            else if(nums[i]==target){
                equal++;
            }
        }
        for(int i=0;i<equal;i++){
            l.add(smaller+i);
        }
        return l;
    }
}