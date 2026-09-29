class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[52];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                freq[ch-'a']++;
            }
            else{
                freq[ch-'A'+26]++;
            }
        }
        int count=0;
        boolean odd = false;
        for(int i=0;i<52;i++){
            if(freq[i]%2==0){
                count+=freq[i];
            }
            else{
                count+=(freq[i]-1);
                odd=true;
            }
        }
        if(odd){
            count++;
        }
        return count;
    }
}