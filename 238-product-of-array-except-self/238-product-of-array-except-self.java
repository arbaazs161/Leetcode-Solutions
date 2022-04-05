class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] product = new int[n];
        
        if(n < 1){
            return product;
        }
        
        int leftAns = 1;
        for(int i = 0; i < n; i++){
            leftAns *= nums[i];
            product[i] = leftAns;
        }
        
        int rightAns = 1;
        
        for(int i = n - 1; i > 0; i--){
            product[i] = product[i-1] * rightAns;
            rightAns *= nums[i];
        }
        product[0] = rightAns;
        return product;
    }
}