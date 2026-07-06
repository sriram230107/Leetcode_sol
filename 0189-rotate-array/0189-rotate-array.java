class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k%=n;
       for(int i=0;i<n/2;i++)
       {
        int temp=nums[n-1-i];
        nums[n-1-i]=nums[i];
        nums[i]=temp;
       }
       for(int i=0;i<k/2;i++)
       {
        int temp=nums[k-1-i];
        nums[k-1-i]=nums[i];
        nums[i]=temp;
       }
       int s=0;
       int m=k;
       for(int i=0;i<(n-k)/2;i++)
       {
        int temp=nums[n-1-s];
        nums[n-1-s]=nums[m];
        nums[m]=temp;
        s++;
        m++;
       }
    }
}
