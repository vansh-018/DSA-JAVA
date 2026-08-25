class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        for(int num : nums){
            s.add(num);
        }
        int temp =k;
        while(s.contains(temp)){
            temp+=k;
        }
        return temp;
    }
}