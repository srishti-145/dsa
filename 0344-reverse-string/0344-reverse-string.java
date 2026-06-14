class Solution {
    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char p=s[left];
            char q=s[right];

            s[left]=q;
            s[right]=p;
            left++;
            right--;
        }
        
    }
}