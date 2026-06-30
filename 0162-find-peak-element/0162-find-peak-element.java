class Solution {
    public int findPeakElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n =nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        return map.get(nums[n-1]);
    }
}