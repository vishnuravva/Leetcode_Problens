package Leetcode_Problems;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char chars[] = s.toCharArray();
        for(int i = 0;i < chars.length;i++){

            if(chars[i] == '('){
                st.push(')');
            }
            else if(chars[i] == '['){
                st.push(']');
            }
            else if(chars[i] == '{'){
                st.push('}');
            }
            else if(st.isEmpty() || st.pop() != chars[i]){
                return false;
            }
        }
        return st.isEmpty();
    }
}
