class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       HashSet<Character> set=new HashSet<>();
       int st=0;
      int  maxl=0;
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        while(set.contains(c)){
            set.remove(s.charAt(st));
            st++;
        }
        set.add(c);
        maxl=Math.max(maxl,i-st+1);
       }
       return maxl;
    }
}