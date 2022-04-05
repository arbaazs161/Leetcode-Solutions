class Solution {
    public void sortColors(int[] nums) {
        //Sol 1
        
        int num0=0, num1=0, num2=0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                num0++;
            }else if( nums[i] == 1){
                num1++;
            }
            else{
                num2++;
            }
        }
        
        int j;
        
        for(j = 0; j < num0; j++){
            nums[j] = 0;
        }
        for(j = num0; j < num0+num1; j++){
            nums[j] = 1;
        }
        for(j=num1+num0; j < num0+num1+num2; j++){
            nums[j] = 2;
        }
    }
}