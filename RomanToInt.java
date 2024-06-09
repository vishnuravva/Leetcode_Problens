package Leetcode_Problems;

import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        int output = 0;
        char cs[] = s.toCharArray();


        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        for(int i=0;i<cs.length;i++){
            if((i+1 < cs.length) && (hm.get(cs[i]) < hm.get(cs[i+1]))){
                output -= hm.get(cs[i]);
            }else{
                output += hm.get(cs[i]);
            }
        }
        return output;

    }
}
