class Solution {
    public int majorityElement(int[] nums) {
 int ele=nums[0];
 int c=0;
 int i;
 for(i=0;i<nums.length;i++){
     if(c==0){
        ele=nums[i];
    }
   if(nums[i]==ele){
    c++;
   }
   else if(nums[i]!=ele){
    c--;
   }
 }
 return ele;
    }
}