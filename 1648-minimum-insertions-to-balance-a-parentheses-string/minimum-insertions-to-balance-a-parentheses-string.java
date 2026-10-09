class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int bal = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                bal+=2;
            }
            else{
                if(i+1<n && s.charAt(i+1) == ')'){
                    bal-=2;
                    i++; // to not process again
                }
                else{
                    ans++;
                    bal-=2;
                }
            }
            if(bal<0){
                ans++;
                bal+=2;
            }

            
        }
        ans += bal;
        return ans;
    }
}