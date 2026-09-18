class Solution {
    public int[] rearrangeArray(int[] nums) {
      int[] arr = new int[nums.length];
      int k=0;
      int m=1;
      int i;
      for(i=0;i<nums.length;i++){
        if(nums[i]>=0){
            arr[k]=nums[i];
            k=k+2;
        }
        else{
            arr[m]=nums[i];
            m=m+2;
        }
      }
      return  arr;
    }
}