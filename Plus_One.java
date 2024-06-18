class Solution {
    public int[] plusOne(int[] digits) {

        // first soln
        // for(int i=digits.length - 1;i >= 0 ;i--){
        //       if(digits[i] < 9){
        //          digits[i]++;
        //          return digits;
        //       }      
        //       digits[i] = 0;
        // }
        // digits = new int[digits.length + 1];
        // digits[0] = 1;
        // return digits;

// Second soln
     int i = digits.length - 1;
     while(i >= 0){
            if(digits[i] == 9){
                digits[i] = 0;
                i--;
            }
            else{
 digits[i] += 1;
            return digits;
            }
     }
     digits = new int[digits.length + 1];
     digits[0] = 1;
     return digits;
    }
}
