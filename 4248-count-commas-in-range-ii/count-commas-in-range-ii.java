class Solution {
    public long countCommas(long n) {
        long start=1000;
        long total_comma=0;
        while(start<=n){
            total_comma += (n-start+1);
            start *= 1000;
        }
        return total_comma;
    }
}