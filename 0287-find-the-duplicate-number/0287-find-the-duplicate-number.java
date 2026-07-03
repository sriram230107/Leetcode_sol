class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int a:map.keySet())
        {
            if(map.get(a)>1)
            {
                return a;
            }
        }
        return 0;
    }
}