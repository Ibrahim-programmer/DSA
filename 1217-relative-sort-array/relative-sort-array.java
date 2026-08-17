class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        Map<Integer,Integer> count = new TreeMap<>();
        for(int i : arr1){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        int index = 0;
        for(int i =0;i<n2;i++){
            int temp = arr2[i];
            while(count.containsKey(temp)){
                count.put(temp,count.get(temp)-1);
                arr1[index++]= temp;
                if(count.get(temp) == 0){
                    count.remove(temp);
                }

            }
        }
        if(index != n1)
        for(Integer key: count.keySet()){
            while(count.get(key) != 0){
                arr1[index++]= key;
                count.put(key,count.get(key)-1);
            }
        }
        return arr1;
    }
}