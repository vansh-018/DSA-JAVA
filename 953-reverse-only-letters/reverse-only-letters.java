class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length(); 
        int left = 0;
        int right = n-1;
        char[] arr = s.toCharArray();
        while(left<right){
            char x = s.charAt(left);
            char y = s.charAt(right);
            if(Character.isLetter(x) && Character.isLetter(y)){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if(!Character.isLetter(y)){
                right--;
            }
            else if(!Character.isLetter(x)){
                left++;
            }
        }
        return new String(arr);
    }
}