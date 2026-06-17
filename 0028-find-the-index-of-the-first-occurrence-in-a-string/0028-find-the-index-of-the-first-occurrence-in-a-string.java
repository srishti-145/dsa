class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length()-needle.length();i++){
            String t=haystack.substring(i,needle.length()+i);
            if(t.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}