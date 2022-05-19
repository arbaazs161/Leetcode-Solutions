class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        /*List<Integer> less = new ArrayList<>();
        List<Integer> more = new ArrayList<>();
        int cntPiv = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == pivot){
                cntPiv++;
            } else if(nums[i] < pivot){
                less.add(nums[i]);
            } else{
                more.add(nums[i]);
            }
        }
        
        for(int i = 0; i < less.size(); i++){
            nums[i] = less.get(i);
        }
        
        for(int i = less.size() ; i < less.size()+cntPiv; i++){
            nums[i] = pivot;
        }
        int n =0;
        for(int i = less.size() + cntPiv; i < nums.length; i++){
            nums[i] = more.get(n);
            n++;
        }
        
        return nums;*/
        
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        for (int i = 0, j = n - 1; i < n; ++i, --j) {
            if (nums[i] < pivot) {
                ans[left++] = nums[i];
            }
            if (nums[j] > pivot) {
                ans[right--] = nums[j];
            }
        }
        while (left <= right) {
            ans[left++] = pivot;
        }
        return ans;
    }
}