class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int high;
        int low=0;
        int sum=0;
        int len;
        double maxi=Integer.MIN_VALUE;
        double av;
        for(high=0;high<nums.length;high++){
            sum=sum+nums[high];
            len=high-low+1;
            av=(double)sum/len;
            while(len>k){
                sum=sum-nums[low];
                low++;
                len=high-low+1;
                av=(double)sum/len;
            }
            if(len==k){
                maxi=Math.max(maxi,av);
            }
        }
        return maxi;
    }
}