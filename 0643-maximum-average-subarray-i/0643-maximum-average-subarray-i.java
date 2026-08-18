class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int high;
        int low=0;
        int sum=0;
        double maxi=Integer.MIN_VALUE;
        
        for(high=0;high<k;high++){
            sum=sum+nums[high];
        }
               maxi=Math.max(maxi,(double)sum/k);
            while(high<nums.length){
                sum=sum-nums[low];
                low++;
                if(high==nums.length){
                    break;
                }
                sum=sum+nums[high];
                high++;
              
                 maxi=Math.max(maxi,(double)sum/k);

            }
            
        return maxi;
    }
}