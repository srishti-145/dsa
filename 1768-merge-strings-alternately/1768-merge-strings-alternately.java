class Solution {
    public String mergeAlternately(String w, String p) {
        StringBuilder s=new StringBuilder();
        int i=0;
        int j=0;
        while(i<w.length() || j<p.length()){
            if(i<w.length()){
                s.append(w.charAt(i));
            
            }
            if(j<p.length()){
                s.append(p.charAt(j));
                
            }
            i++;
            j++;
        }
        return s.toString();
    }
}