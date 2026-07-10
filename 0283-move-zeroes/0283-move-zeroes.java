class Solution {
    public void moveZeroes(int[] nums) {
            int b=nums.length;
            int count=0;
            for(int i=0;i<b;i++)
            {
                if(nums[i]!=0)
                {
                    nums[count]=nums[i];
                    count++;
                }
            }
            while(count<b)
            {
                nums[count++]=0;
            }
        
    }
}