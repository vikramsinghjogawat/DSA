public class PowerSetOfAnArray {
    public static void main(String[] args) {
        List<List<Integer>> allCombinations = new ArrayList<>();

        allCombinations.add(new ArrayList<>());
        //Added the initial emplty array
        //[[]]
        int[] arr = {0,1,2};
        for(int i=0;i<arr.length;i++){
            int elementToAdd = arr[i];
            //Take size initially
            int size = allCombinations.size();
            //Go to all original elements then create a new copy with elementToAdd
            for(int e=0;e<size;e++){
                List<Integer> newSubset = new ArrayList<>(allCombinations.get(e));
                newSubset.add(elementToAdd);
                allCombinations.add(newSubset);
            }
        }

        System.out.println(allCombinations);
    }
}
