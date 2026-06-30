class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i=i+2)
        {
            if(nums[i]!=nums[i+1])
            {
                return nums[i];
            }
            // if(n%2!=0)
            // {
            //     if(i<n-2){
            //     if(nums[i]!=nums[i+1])
            //     {
            //         return nums[i];
            //     }
            //     }
            //     else 
            //     return nums[n-1];
            // }
        }
        return nums[n-1];
    }
}