class Solution {
    public String processStr(String s) {
        StringBuilder t=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                t.append(c);
            }
            else if(c=='*'){
                if(t.length()>0){
                t.deleteCharAt(t.length()-1);
                }
            }
            else if(c=='#'){
                t.append(t);
            }
            else{
                t.reverse();
            }

        }
        return t.toString();
    }
}