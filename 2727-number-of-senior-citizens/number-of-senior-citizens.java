class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;
        int count=0;
        for(int i=0;i<n;i++){
            String s = details[i];
            int res = (Character.getNumericValue(s.charAt(11))*10) + Character.getNumericValue(s.charAt(12));;
            
            if(res>60){
                count++;
            }
        }
        return count;
    }
}