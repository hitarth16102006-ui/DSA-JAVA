class Solution {
    public int findPeakElement(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]<nums[i+1] && nums[i+1]>nums[i+2]){
                num=nums[i];
            }else 
            num=nums[0];
        }
        return num;
    }
}