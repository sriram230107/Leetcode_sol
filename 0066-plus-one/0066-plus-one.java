class Solution {
    public int[] plusOne(int[] digits) {
        int k=digits.length;
        int n=digits.length;
        int i=1;
        int s=0;
        int [] digi=new int[n+1];
        if(digits[n-1]!=9)
        {
            digits[n-1]=digits[n-1]+1;
        }
        else
        {
            while(i<=n)
            {
                if(digits[n-i]==9)
                {
                    digits[n-i]=0;
                    i++;
                }
                else{
                    if(digits[n-i]!=9)
                    {
                        digits[n-i]=digits[n-i]+1;
                        return digits;
                    }
                }
            }
            for(int f=0;f<n;f++)
            {
                if(digits[f]!=0)
                {
                    s=s+1;
                }
            }
            if(s==0)
            {
                digi[0]=1;
                return digi;
            }
        }
        return digits;
        
    }
}