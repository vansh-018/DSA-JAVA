class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxdepth=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                depth++;
            }
            else if(ch==')'){
                depth--;
            }
            maxdepth=Math.max(depth,maxdepth);
        }
        return maxdepth;
    }
}