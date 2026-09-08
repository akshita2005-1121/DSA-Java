class Solution {
    public int majorityElement(int[] nums) {
        int ele=0;
        int count=0;
        int i;
        int c=0;
        for(i=0;i<nums.length;i++){
            if(count==0){
                ele=nums[i];
            }
            if(nums[i]==ele){
                count++;
            }
            else{
                count--;
            }
        }
        int c1=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==ele){
                c1++;
            }
        }
        if(c1>nums.length/2){
            return ele;
        }
        
            return -1;

    }
}