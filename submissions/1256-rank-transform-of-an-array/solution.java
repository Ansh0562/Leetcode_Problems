class Solution {
    public int[] arrayRankTransform(int[] arr) {
    int [] arr1 = new int [arr.length];
        for(int i=0;i<arr.length;i++)
        {
            arr1[i]=arr[i];
        }
    Arrays.sort(arr1);
    HashMap<Integer,Integer> map = new HashMap<>();
    int rank =1;

    for (int num: arr1){
        if(!map.containsKey(num)){
            map.put(num,rank);
            rank++;
        }
    }

    int ans[] = new int[arr.length];
    for(int i=0;i<arr.length;i++){
        ans[i]=map.get(arr[i]);
    }
    return ans;
    }
}
