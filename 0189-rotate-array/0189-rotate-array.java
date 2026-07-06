class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        int []arr=nums.clone();;
        int s=n-1-k+1;
        int m=k;
        for(int i=0;i<k;i++)
        {
            nums[i]=arr[s];
            s++;
        }
        for(int j=k,l=0;j<n;j++)
        {
            nums[m++]=arr[l++];
        }
    }
}
