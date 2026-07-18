class Solution {
    public int thirdMax(int[] nums) {
        int max=0;
        int smax=-1;
        int tmax=INT.;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>smax && nums[i]<max){
                smax=nums[i];
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>tmax && nums[i]<smax){
                tmax=nums[i];
            }
        }

        if(tmax>0){
            return tmax;
        }else{
            return max;
        }
    }

}