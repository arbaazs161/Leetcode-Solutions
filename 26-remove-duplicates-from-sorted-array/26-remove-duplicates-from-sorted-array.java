class Solution {
    public int removeDuplicates(int[] nums) {
        int curr = 0; int check = 1;
        
        
        while(check < nums.length){
            if(nums[check] == nums[curr]){
                check++;
            }else{
                curr++;
                nums[curr] = nums[check];
            }
        }
        
        return curr+1;
    }
}