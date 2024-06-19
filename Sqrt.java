class Solution {
    public int mySqrt(int n) {

// newton raphson method
        long r = n;
        while(r*r > n){
            r = (r + n/r) / 2;
        }
        return (int) r;
        
    // Using binary search
        // int start = 0;
        // int end = n;
        // int mid = -1;
         
        // while(start <= end){
        //     mid = (start + end) / 2;
            
        //     if(mid * mid == n) return mid;
        //     else if((long) mid * mid > (long)n) {
        //         end = mid - 1; 
        //     }
            
        //     else {
        //         start = mid + 1;
        //     }
        // }
        // return Math.round(end);

// brute force approach
        // int i = 1;
        // while(i <= n/i){
        //     if(n/i == i){
        //         return i;
        //     }
        //     i++;
           
        // }
        //  return i-1;
    }
}
