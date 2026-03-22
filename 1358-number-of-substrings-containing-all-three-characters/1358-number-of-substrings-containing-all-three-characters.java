class Solution {
    public int numberOfSubstrings(String s) {
        int a=-1;
        int b=-1;
        int c=-1;
        int count=0;
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(t=='a'){
                a=i;
            }
            if(t=='b'){
                b=i;
            }
            if(t=='c'){
                c=i;
            } 
            if(a!=-1 && b!=-1 && c!=-1){
                int minl=Math.min(a,Math.min(b,c));
                int tp=1+minl;
                count+=tp;
            }
        }
        return count;
    }
}