class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        Arrays.sort(nums);
        findPermutations(nums, ds, ans, freq);
        return ans;
    }
    
    private void findPermutations(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(!freq[i]){
                if(i > 0 && nums[i-1] == nums[i] && !freq[i-1]) continue;
                freq[i] = true;
                ds.add(nums[i]);
                findPermutations(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}