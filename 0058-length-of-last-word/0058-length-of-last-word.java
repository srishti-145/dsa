class Solution {
    public int lengthOfLastWord(String s) {
        int c=0;
        int j=s.length()-1;
        while(!Character.isLetter(s.charAt(j))){
            j--;
        }
       for(int i=j;i>=0;i--){
        if(s.charAt(i)==' '){
            break;
        }
        c++;
       }
       return c;
    }
}