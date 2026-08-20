class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int a=arr1.get(arr1.size()-1);
            int b=arr2.get(arr2.size()-1);
            if(a>b){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int res[]=new int[nums.length];
        int k=0;
        for(int i=0;i<arr1.size();i++){
            res[k]=arr1.get(i);
            k++;
        }
        for(int i=0;i<arr2.size();i++){
            res[k]=arr2.get(i);
            k++;
        }  
        return res;  
    }
}