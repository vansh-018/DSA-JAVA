class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> s =new HashSet<>();
        for(int i=0;i<digits.length;i++){
            if(digits[i]!=0){
                for(int j=0;j<digits.length;j++){
                    if(j!=i){
                        for(int k=0;k<digits.length;k++){
                            if(k!=i && k!=j){
                                if(digits[k]%2==0){
                                    int nums =digits[i]*100 + digits[j]*10+digits[k];
                                    s.add(nums);
                                }
                            }
                        }
                    }
                }
            }
        }
        return s.size();
    }
}