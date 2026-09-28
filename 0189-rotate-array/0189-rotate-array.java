class Solution {
    public void rotate(int[] nums, int k) {
        int d=k%nums.length;
    ArrayList<Integer>temp=new ArrayList<>();
    int i;
    for(i=nums.length-d;i<nums.length;i++){
        temp.add(nums[i]);
    }
  for(i=nums.length-d-1;i>=0;i--){
       nums[i+d]=nums[i];
  }
    for(i=0;i<d;i++){
        nums[i]=temp.get(i);
    }
  
    }
}