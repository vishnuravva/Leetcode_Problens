package Leetcode_Problems;

// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         String result = "";
//         Arrays.sort(strs);

//         char[] first = strs[0].toCharArray();
//         char[] last = strs[strs.length - 1].toCharArray();
//         int c = 0;
//         while(c < first.length){

//             if(first[c] == last[c]){
//                 result += first[c];
//                 c++;
//             }else{
//                 break;
//             }
//         }
//         return c == 0 ? "" : result;
//     }
// }
class Reverse_Integer {
    public String longestCommonPrefix(String[] strs) {
        String start = strs[0];

        for(int i = 1;i < strs.length;i++){
            while(strs[i].indexOf(start) != 0){
                start = start.substring(0,start.length() - 1);
            }
        }
        return start;
    }

    public static void main(String[] args) {
        String s = " ";
        s.trim();
        System.out.println(s.length());
    }
}
