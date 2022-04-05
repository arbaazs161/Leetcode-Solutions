class Solution {
    public void sortColors(int[] nums) {
        
        //Sol 2
        
        int lo = 0, hi = nums.length-1, mid = 0; int temp;
        
        while(mid<=hi){
            switch(nums[mid]){
                case 0:
                    temp = nums[lo];
                    nums[lo] = nums[mid];
                    nums[mid] = temp;
                    lo++; mid++;
                    break;
                
                case 1:
                    mid++;
                    break;
                    
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[hi];
                    nums[hi] = temp;
                    hi--;
                    break;
            }
        }
        
        //Sol 1
        
        /*int num0=0, num1=0, num2=0;
        
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
        }*/
    }
}