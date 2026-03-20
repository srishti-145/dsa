class Solution {
    public String convert(String s, int numRows) {
         if(numRows == 1) return s;

        HashMap<Integer, Integer> map = new HashMap<>();
        int temp = numRows;

        for(int i = 0; i < s.length(); i++){
            map.put(i, temp);
            temp--;

            if(temp == 0){
                i++;
                temp = temp + 2;

                while(temp != numRows && i < s.length()){
                    map.put(i, temp);
                    i++;
                    temp++;
                }

                i--;
                temp = numRows;
            }
        }

        // Create rows
        ArrayList<StringBuilder> rows = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            rows.add(new StringBuilder());
        }

        // Fill rows
        for(int i = 0; i < s.length(); i++){
            int row = map.get(i) - 1;
            rows.get(row).append(s.charAt(i));
        }

        // Combine rows (top → bottom)
        StringBuilder ans = new StringBuilder();
        for(int i = numRows - 1; i >= 0; i--){
            ans.append(rows.get(i));
        }

        return ans.toString();
    }
}