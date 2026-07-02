class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int max=0;
        int res=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i:map.keySet())
        {
            if(map.get(i)>max)
            {
                max=map.get(i);
                res=i;
            }
        }
        return res;
        
    }
}