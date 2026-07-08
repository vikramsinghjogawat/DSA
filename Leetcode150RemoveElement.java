public class Leetcode150RemoveElement{
    public int removeElement(int[] nums, int val) {
        List<Integer> l = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            if(nums[i]==val){
                l.add(i);
            }
            i++;
        }
        System.out.println("Number of vals "+l.size()+" - "+l);
        if(l.size()==0) return nums.length;
        i=nums.length-1;
        int count=0;
        while(i>=0){
            if(nums[i]!=val){
                nums[l.get(count)]=nums[i];
                count++;
            }
            if(count==l.size()) break;
            i--;
        }
        return nums.length-l.size();
    }
}