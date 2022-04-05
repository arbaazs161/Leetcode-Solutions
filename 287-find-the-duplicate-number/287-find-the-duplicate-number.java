class Solution {
    public int findDuplicate(int[] nums) {
        
        //sol 3
        int slow = nums[0];
        int fast = nums[0];
        
        do{
            slow=nums[slow];
            fast = nums[nums[fast]];
            
        }while(slow!=fast);
        
        fast = nums[0];
        
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
        
        //sol 1
        /*Arrays.sort(nums);
        int curr = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(curr == nums[i]){
                return curr;
            }
            curr = nums[i];
        }
        return 0;*/
        //
        //Sol 2
        /*Set<Integer> map = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.add(nums[i])) return nums[i];
            
            map.add(nums[i]);
        }
        
        return 0;*/
        
    }
}