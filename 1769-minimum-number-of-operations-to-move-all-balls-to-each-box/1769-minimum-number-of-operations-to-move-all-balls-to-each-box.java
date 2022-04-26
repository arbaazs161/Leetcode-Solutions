class Solution {
    public int[] minOperations(String boxes) {
        /*int n = boxes.length();
        int[] ans = new int[n];
        
        for(int i = 0; i < n; i++){
            int j = i;
            
            while(j < n){
                if(boxes.charAt(j) == '1'){
                    ans[i] += Math.abs(i-j);
                }
                j++;
            }
            
            j = i;
            while(j >= 0){
                if(boxes.charAt(j) == '1'){
                    ans[i] += Math.abs(i-j);
                }
                j--;
            }
            
        }
        
        return ans;*/
        
        char ch[]=boxes.toCharArray();
        int n=boxes.length();
        int left[]=new int[n];
        int right[]=new int[n];
        int count=0;
        count=ch[0]-'0';
        for(int i=1;i<n;i++)
        {
           left[i]=left[i-1]+count;
            count+=ch[i]-'0';
        }
        count=ch[n-1]-'0';
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]+count;
            count+=ch[i]-'0';
        }
        int ans[]=new int [n];
        for(int i=0;i<n;i++)
        {
            ans[i]=left[i]+right[i];
        }
        return ans;
    }
}