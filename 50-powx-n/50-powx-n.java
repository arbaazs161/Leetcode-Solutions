class Solution {
    public double myPow(double x, int n) {
        return helper(x, n);
    }
    
    private double helper(double x, long n){
        if(n==0)    return 1.0;
        if(n==1)    return x;
		if(n<0)     return helper(1/x, -n); //for negative powers, x goes in denominator and we perform (-)n to make power postive
        double res = helper(x*x, n/2); //we skip some iterations by doing so i.e if we have 2^16 in next call it becomes 4^8 further it becomes 16^4 further again it becomes 256^2 and lastly we are left with 65536 which is our answer. Easy! 
		if(n%2==1){
            res = res * x; // since for odd powers we are left with one remaining power so we mutiply our result by x for one last time
        }
        return res;
    }
}