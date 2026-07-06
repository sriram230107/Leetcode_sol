class Solution {
    public void rotate(int[] nums,int left,int right)
    {
        while(!(left<=right))
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left--;
            right++;
        }
    }
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k%=n;
        rotate(nums,n-1,0);
        rotate(nums,k-1,0);
        rotate(nums,n-1,k);
       
    }
}
