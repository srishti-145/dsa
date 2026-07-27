class Solution {
    public int compress(char[] chars) {
        int write = 0; 
        int i = 0;    

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

           
            chars[write++] = currentChar;

           
           if (count > 1) {
            String s = Integer.toString(count);
            for (int j = 0; j < s.length(); j++) {
                chars[write++] = s.charAt(j);
                }
            }
        }

        return write; 
           

    }
}