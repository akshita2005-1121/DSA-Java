class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int count =0;
     int i;
     int maxi=0;
     for(i=0;i<nums.length;i++){
        if(nums[i]==1){
            count++;
            maxi=Math.max(maxi,count);
        }
        else if(nums[i]==0){
            count=0;
        }
     }
     return maxi;
    }
}