class Solution {
    public char findTheDifference(String s, String t) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<s.length();i++){
            int asc1 = s.charAt(i);
            sum1 += asc1;
        }
        for(int j=0;j<t.length();j++){
            int asc2 = t.charAt(j);
            sum2 += asc2;
        }
        int diff = sum2-sum1;
        char ch = (char)diff;
        return ch;
    }
}