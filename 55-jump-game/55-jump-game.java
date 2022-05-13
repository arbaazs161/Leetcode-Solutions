class Solution {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for (int i=0; i<nums.length; ++i) {
            if (i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
        
        /*
        
        int len = nums.length;
        if(len==1){
            return true;
        }
        boolean[] isReachableFromZero = new boolean[len];
        isReachableFromZero[0] = true;
        for(int i=1;i<len;i++){
            for(int j=i-1;j>=0;j--){
                // If j is reachable from zero
                // and from j, we can reach i
                // Means we can reach i from Zero
                if(isReachableFromZero[j]&&j+nums[j]>=i){
                    isReachableFromZero[i]=true;
                    break;
                }
            }
        }
        return isReachableFromZero[len-1];
        
        */
    }
}