class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int []sorted=arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i],rank);
                rank++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}