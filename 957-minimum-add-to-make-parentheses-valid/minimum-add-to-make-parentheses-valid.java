class Solution {
    public int minAddToMakeValid(String s) {
        int ob = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                ob++;
            }
            else{
                if(ob>0){
                    ob--;
                }
                else{
                    count++;
                }
            }
        }
        return count+ob;
    }
}