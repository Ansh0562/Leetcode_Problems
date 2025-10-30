class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        int [] result = new int [arr1.length];
        int k=0;
        for (int num:arr1){
            arr.add(num);
        }
        for (int i=0;i<arr2.length;i++){
            for(int j=0;j<arr.size();j++){
                if(arr.get(j)==arr2[i]){
                    result[k++]=arr.get(j);
                    arr.remove(j);
                    j--;
                    
                }
            }
        }
        Collections.sort(arr);
        for (int num : arr) {
            result[k++] = num;
        }

        return result;

    }
}
