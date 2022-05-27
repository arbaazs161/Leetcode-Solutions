class Solution {
    public int missingNumber(int[] nums) {
        /*Arrays.sort(nums);
        
        for(int i =0 ; i < nums.length; i++){
            if(nums[i] != i){
                return nums[i] - 1;
            }
        }
        
        return nums.length;*/
        
        int len = nums.length;
        int sum = (0+len)*(len+1)/2;
        for(int i=0; i<len; i++)
            sum-=nums[i];
        return sum;
    }
}