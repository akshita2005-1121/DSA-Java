class Solution {
    public void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        int twos=0;
        int i;
        int k=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }
            else if(nums[i]==1){
                ones++;
    
            }
            else if(nums[i]==2){
                twos++;
            }
        }
        for(i=0;i<zeros;i++){
            nums[k]=0;
            k++;
        }
        for(i=0;i<ones;i++){
            nums[k]=1;
              k++;
        }
        for(i=0;i<twos;i++){
            nums[k]=2;
            k++;
        }
        
    }
}