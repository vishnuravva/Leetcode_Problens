class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int i = s.length() - 1;
        int count = 0;
        while(i >= 0 && s.charAt(i) != ' '){
           if(Character.isLetter(s.charAt(i))){
            count++;
            i--;
           }
        }
        return count;

        // String[] strArray = s.split(" ");
        // String lastWord = strArray[strArray.length-1];
        // return lastWord.length();
    }
}
