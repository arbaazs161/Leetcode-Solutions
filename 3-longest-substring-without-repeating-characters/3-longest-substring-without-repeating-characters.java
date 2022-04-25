class Solution {
    public int lengthOfLongestSubstring(String str) {
        
        int n = str.length();
 
        int res = 0;
 
        /*int [] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);
 
        int i = 0;
 
        for (int j = 0; j < n; j++) {
 
            i = Math.max(i, lastIndex[str.charAt(j)] + 1);
 
            res = Math.max(res, j - i + 1);
 
            lastIndex[str.charAt(j)] = j;
        }
        return res;*/
        
        //Approach 2 - Optimal
        int r = 0, l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r < n){
            if(map.containsKey(str.charAt(r))){
                l = Math.max(map.get(str.charAt(r)) + 1, l);
            }
            
            map.put(str.charAt(r), r);
            res = Math.max(res, r-l+1);
            r++;
        }
        
        return res;
        //Approach 1
        //Using 2 pointer approach and a set.
        //move right pointer to right if the character is not present in the set
        //move left pointer to right and remove element at left pointer from 
        //set if character at right pointer is present in set.
        //Repeat until end of array is reached. TC -> O(2n); SC -> O(n);
    }
}