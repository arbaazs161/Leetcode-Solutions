class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int curr = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(curr == nums[i]){
                return curr;
            }
            curr = nums[i];
        }
        return 0;
    }
}