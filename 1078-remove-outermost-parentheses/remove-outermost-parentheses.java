class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(st.isEmpty()){
                if(ch == '('){
                    st.push(ch);
                }
            }
            else{
                if(ch == '('){
                    st.push(ch);
                    ans+=ch;
                }
                else{
                    st.pop();
                    if(!st.isEmpty()){
                        ans+=ch;
                    }
                }
            }
        }
        return ans;
    }
}