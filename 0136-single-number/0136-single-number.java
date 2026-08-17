class Solution {
    public int singleNumber(int[] nums) {
        int i,j;
        for(i=0;i<nums.length;i++){
            int c=0;
            for(j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==1){
                return nums[i];
            }
        }
        return -1;
    }
}