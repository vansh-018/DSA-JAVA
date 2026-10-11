class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] ans = new int[m+n];
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        for(int i = m-1;i>=0;i--){
            for(int j = n-1;j>=0;j--){
                int mul = (num1.charAt(i) - '0')*(num2.charAt(j)-'0');
                int sum = mul + ans[i+j+1];
                ans[i+j+1] = sum%10;
                ans[i+j]+=sum/10;
            }
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<ans.length;i++){
            if(res.length()==0 && ans[i]==0){
                continue;
            }
            res.append(ans[i]);
        }
        return res.toString();
    }
}