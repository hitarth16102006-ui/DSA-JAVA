class Solution {
    public int findPeakElement(int[] nums) {
        int index=0;
        int num=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>num){
              index=i;
              num=nums[i];
            }
        }
        return index;
    }
}