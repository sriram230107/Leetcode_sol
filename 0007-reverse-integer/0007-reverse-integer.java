class Solution {
    public int reverse(int x) {
        long arr=0;
        while(x!=0)
        {
            
            int a=x%10;
            arr=(arr*10)+a;
            x/=10;
        }
        if(arr>Integer.MAX_VALUE || arr<Integer.MIN_VALUE)
            {
                return 0;
            }
        else
        return (int)arr;
    }
}