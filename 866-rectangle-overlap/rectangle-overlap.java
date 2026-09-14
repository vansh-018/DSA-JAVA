class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean x = false;
        boolean y = false;
        if(rec2[0]<rec1[2] && rec2[2]>rec1[0]){
            x=true;
        }
        if(rec2[1]<rec1[3] && rec2[3]>rec1[1]){
            y=true;
        }
        return x && y;
    }
}