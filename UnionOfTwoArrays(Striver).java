class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i=0;
        int n=nums1.length;
        int j=0;
        int m=nums2.length;
        while(i<n && j<m){
            if(i>0 && nums1[i]==nums1[i-1]){
                i++;
                continue;
            }
               if(j>0 && nums2[j]==nums2[j-1]){
                j++;
                continue;
            }
            if(nums1[i]==nums2[j]){
                
                union.add(nums1[i]);
                i++;
                j++;
                
            }
            else if(nums1[i]<nums2[j]){
                union.add(nums1[i]);
                i++;
            }
            else{
                union.add(nums2[j]);
                j++;
            }
        }
        
        while(i<n){
             if(i>0 && nums1[i]==nums1[i-1]){
                i++;
                continue;
            }
            union.add(nums1[i]);
                i++;
        }
        while(j<m){
              if(j>0 && nums2[j]==nums2[j-1]){
                j++;
                continue;
            }
        union.add(nums2[j]);
                j++;
        }
       int[]ans=new int[union.size()];
       for(int k=0;k<union.size();k++){
        ans[k]=union.get(k);
       }


return ans;
        
    }
}