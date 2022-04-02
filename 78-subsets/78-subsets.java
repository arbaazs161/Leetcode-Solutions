class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);  //To avoid duplicate numbers
        
        List<List<Integer>> ans = new ArrayList<>();
        
        findSubsets(0, nums, new ArrayList<>(), ans);
        
        return ans;
    }
    
    public void findSubsets(int index, int[] nums, List<Integer> ds, List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));   // add all subsets found at each recursive call
        for(int i = index; i < nums.length; i++){   //Loop to check all integers from index and pick the first unique integer
            //if(i!=index && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findSubsets(i+1, nums, ds, ans);    
            ds.remove(ds.size() - 1);   // remove the last added integer to get all subsets at a particular level
        }
    }
}