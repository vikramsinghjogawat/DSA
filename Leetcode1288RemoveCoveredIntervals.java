class Leetcode1288RemoveCoveredIntervals {
    //[[1,2],[3,6],[1,8]] <-edge case
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
    public int optimizedRemoveCoveredIntervals(int[][] intervals) {
        int count=0;
        int maxEnd =-1;
        Arrays.sort(intervals,(a,b)->a[0]!=b[0]?a[0]-b[0]:b[1]-a[1]);
        //Tracking only maxEnd because it will decide if it covered or not
        for(int[] interval :intervals){
            //if covered increment count and set the right wall to be this new wall(end)
            if(interval[1]>maxEnd){
            count++;
            maxEnd=interval[1];
            }
        }
        return count;
    }
}
