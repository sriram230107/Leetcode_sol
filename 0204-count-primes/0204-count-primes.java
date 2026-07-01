class Solution {
    public int countPrimes(int n) {
        boolean[] np=new boolean[n];
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(!np[i])
            {
                for(int j=2*i;j<n;j+=i)
                {
                    np[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(np[i]==false)
            {
                f++;
            }
        }
        return f;
}
}