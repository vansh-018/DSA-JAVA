class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0;
        if(s > 9 * n) return -1;
        int ans = -1;
        int maxval=-1;
        int limit = (int)Math.pow(10,n);
        for(int i=1;i<limit;i++){
            int num = i;
            int sum = 0;
            while(num!=0){
                int x = num%10;
                sum+=x;
                num=num/10;
            }
            if(sum == s){
                maxval=Math.max(ans,i);
            }
        }
        ans = maxval;
        return ans;
    }
}