package Leetcode_Problems;

class Valid_Palindrome {
    public boolean isPalindrome(String s) {

/*
hERE WE USED TWO POINTER APPROACH
1] WE WILL USE START AS THE FIRST CHAR FROM STRING AND LAST AS THE LAST CHAR OF STRING
2] RUNNING A LOOP SO THAT START SHOULD BE LESS THAN LAST
3] CHECK IF START OR LAST CHAR IS NOT A NON ALPHANUMERIC AND INCREMENT START++ AND LAST--
4]
*/
        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            char first = s.charAt(start);
            char last = s.charAt(end);

            if(!Character.isLetterOrDigit(first)){
                start++;
            }
            else if(!Character.isLetterOrDigit(last)){
                end--;
            }
            else{
                if(Character.toLowerCase(first) != Character.toLowerCase(last)){
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
    }
}


// class Solution {
//     public boolean isPalindrome(String s) {

//             s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
//             int start = 0;
//             int end = s.length() - 1;

//             while(start < end){
//                 if(s.charAt(start) != s.charAt(end)){
//                     return false;
//                 }
//                 start++;
//                 end--;
//             }
//             return true;
//     }
// }