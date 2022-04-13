class Solution {
    public int trap(int[] height) {
        
        int totalWater = 0;
        int leftP = 0, rightP = height.length - 1, maxLeft = 0, maxRight = 0;
        
        while(leftP < rightP){
            if(height[leftP] < height[rightP]){
                if(height[leftP] > maxLeft){
                    maxLeft = height[leftP];
                } else{
                    totalWater += maxLeft - height[leftP];
                }
                leftP++;
            } else{
                if(height[rightP] > maxRight){
                    maxRight = height[rightP];
                } else{
                    totalWater += maxRight - height[rightP];
                }
                rightP--;
            }
        }
        
        return totalWater;
        
    }
}