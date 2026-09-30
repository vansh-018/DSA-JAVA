class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] ans=new int[n];
        int depth=0;
        for(int i=0;i<n;i++){
            char ch = seq.charAt(i);
            if(ch=='('){
                depth++;
                if(depth%2==0){
                    ans[i]=1;
                }
                else{
                    ans[i]=0;
                }
            }
            else{
                if(depth%2==0){
                    ans[i]=1;
                }
                else{
                    ans[i]=0;
                }
                depth--;
            }
        }
        return ans;
    }
}