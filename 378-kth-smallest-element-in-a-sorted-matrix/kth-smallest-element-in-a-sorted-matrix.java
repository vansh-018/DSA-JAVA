class Solution {

    int count_less(int[][] matrix, int x) {
        int m=matrix.length;
        int n=matrix[0].length;
        int count = 0;
        int c = n - 1;
        for (int r = 0; r < m; r++) {
            while (c >= 0 && matrix[r][c] > x) {
                c--;
            }
            count += c + 1;
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[m - 1][n - 1];
        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = count_less(matrix, mid);
            if (cnt >= k) {
                high = mid;
            } 
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}