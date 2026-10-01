class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0;
        int high = n;
        int[] ans = new int[n+1];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);

            if(ch=='I'){
                ans[i]=low;
                low++;
            }
            else if(ch=='D'){
                ans[i]=high;
                high--;
            }
        }
        ans[n]=low;
        return ans;
    }
}