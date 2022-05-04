class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int n = height.length;
        
        int p1 = 0, p2 = n-1;
        
        while(p1 < p2){
            int length = Math.min(height[p1], height[p2]);
            int width = p2 - p1;
            int area = length * width;
            maxWater = Math.max(maxWater, area);
            
            if(height[p1] <= height[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }
        
        return maxWater;
    }
}