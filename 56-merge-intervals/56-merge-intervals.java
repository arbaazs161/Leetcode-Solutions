class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        list.add(intervals[0]);
        for(int i = 1; i < intervals.length; i++){
            int currIndex = list.size() - 1;
            
            if(intervals[i][0] <= list.get(currIndex)[1]){
                list.get(currIndex)[1] = Math.max(list.get(currIndex)[1], intervals[i][1]);
            }
            else{
                list.add(intervals[i]);
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
}