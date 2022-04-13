class Solution {
    public int uniquePaths(int m, int n) {
        /*List<List<Integer>> dp = new ArrayList<>();
        countPaths(m, n, 0, 0, dp);
        
        return dp.get(0).get(0);*/
        
        int N = n+m-2;
        int r = m-1;
        double res = 1;
        
        for(int i = 1; i <= r; i++){
            res = res* (N-r+i)/i;
            
        }
        return (int)res;
    }
    
    
    //Sol 1 Recursive -- Bruteforce (Going through All paths)
    public int countPaths(int m, int n, int i, int j, List<List<Integer>> dp){
        if(i == (n-1) && j == (m-1)) return 1;
        if(i >= n || j >= m) return 0;
        if(dp.get(i).get(j) != -1) return dp.get(i).get(j);
        return dp.get(i).set(j, countPaths(m, n, i+1, j, dp) + countPaths(m, n, i, j + 1, dp));
    }
}