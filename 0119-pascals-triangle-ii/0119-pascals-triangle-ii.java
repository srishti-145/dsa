class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long ans = 1;
        
        list.add((int)ans);  
        
        for(int r = 1; r <= rowIndex; r++){
            ans = ans * (rowIndex - r + 1) / r;
            list.add((int)ans);
        }
        
        return list;
    }
}