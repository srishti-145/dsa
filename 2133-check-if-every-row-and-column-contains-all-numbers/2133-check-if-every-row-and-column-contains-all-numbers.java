class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){

            int[] rowHash = new int[n+1];
            int[] colHash = new int[n+1];

            for(int j = 0; j < n; j++){
                int row = matrix[i][j];
                int col = matrix[j][i];

                rowHash[row]++;
                colHash[col]++;
            }

            for(int k = 1; k <= n; k++){
                if(rowHash[k] != 1 || colHash[k] != 1){
                    return false;
                }
            }
        }

        return true;
    }
}