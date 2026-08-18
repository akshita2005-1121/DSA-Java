class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int high;
        int low=0;
        int sum=0;
        int len;
        double maxi=Integer.MIN_VALUE;
        double av=0;
        for(high=0;high<k;high++){
            sum=sum+nums[high];
            av=(double)sum/k;
        }
               maxi=Math.max(maxi,av);
            while(k<nums.length){
                sum=sum-nums[low];
                low++;
                if(high==nums.length){
                    break;
                }
                sum=sum+nums[high];
                high++;
                av=(double)sum/k;
                 maxi=Math.max(maxi,av);

            }
            
        return maxi;
    }
}