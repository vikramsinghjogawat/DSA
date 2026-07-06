class Leetcode1288RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        List<List<Integer>> merged = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->{
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }else{
                return Integer.compare(b[1],a[1]);
            }});
        List<Integer> first = new ArrayList<>();
        first.add(intervals[0][0]);
        first.add(intervals[0][1]);
        merged.add(first);
        for(int[] arr:intervals){
            List<Integer> currInterval = merged.get(merged.size()-1);
            int currentEnd = currInterval.get(1);
            if(currentEnd<arr[1]){
            List<Integer> newInterval = new ArrayList<>();
            newInterval.add(arr[0]);
            newInterval.add(arr[1]);
            merged.add(newInterval);
            }
        }
        return merged.size();
    }
}
