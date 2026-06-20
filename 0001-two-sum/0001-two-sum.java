class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap();
        int tt=0;
        for(int i=0;i<nums.length;i++)
        {
            tt=target-nums[i];
            if(map.containsKey(tt))
            {
                return new int []{i,map.get(tt)};
            }
            else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
        
    }
}