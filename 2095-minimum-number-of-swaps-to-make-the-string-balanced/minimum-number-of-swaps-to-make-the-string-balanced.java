class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='['){
                balance++;
            }
            else{
                balance--;
            }
            if(balance < 0){
                count++;
                balance =0;
            }
        }
        return (count+1)/2;
    }
}