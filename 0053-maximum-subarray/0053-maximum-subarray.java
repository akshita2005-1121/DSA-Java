class Solution {
    public int maxSubArray(int[] nums) {
 int i;
 int maxi=Integer.MIN_VALUE;
 int sum=0;
 for(i=0;i<nums.length;i++){
  
     sum=sum+nums[i];
     maxi=Math.max(maxi,sum);
       if(sum<0){
        sum=0;
    }
 }
 return maxi;
    }
}