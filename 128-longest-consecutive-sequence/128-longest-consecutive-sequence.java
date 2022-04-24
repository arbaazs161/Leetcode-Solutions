class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
  
      Set<Integer> set = new HashSet<Integer>();
      for (int i = 0; i < nums.length; i++) {
        set.add(nums[i]);
      }
        
        for(int num : nums){
            if(!set.contains(num-1)){
                int currNum = num;
                int currStreak = 1;
                
                while(set.contains(currNum+1)){
                    currNum+=1;
                    currStreak+=1;
                }
                
                max = Math.max(currStreak, max);
            }
        }
        
        return max;
  
        
    //Approach 1
  /*for (int i = 0; i < nums.length; i++) {
    int count = 1;
    
    // look left
    int num = nums[i];
    while (set.contains(--num)) {
      count++;
      set.remove(num);
    }
    
    // look right
    num = nums[i];
    while (set.contains(++num)) {
      count++;
      set.remove(num);
    }
    
    max = Math.max(max, count);
  }
  
  return max;*/
    }
}