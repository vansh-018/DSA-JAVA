class Solution {
    public boolean checkVowel(char x){

        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ||
        x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
            return true;
        }
        else{
            return false;
        }
    }
    public String reverseVowels(String s) {
        int n = s.length();
        int left = 0;
        int right = n-1;
        char[] arr = s.toCharArray();
        while(left<right){
            char x = s.charAt(left);
            char y = s.charAt(right);
           
            if(checkVowel(x) && checkVowel(y)){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(!checkVowel(y)){
                right--;
            }
            else{
                left++;
            }
        }
        return new String(arr);
    }
}