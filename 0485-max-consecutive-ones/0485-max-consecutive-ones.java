class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i;
        int maxi=0;
        int len=0;
for(i=0;i<nums.length;i++){
    if(nums[i]==1){
        len++;
        maxi=Math.max(maxi,len);
    }
    else{
        len=0;
    }
}
return maxi;
    }
}