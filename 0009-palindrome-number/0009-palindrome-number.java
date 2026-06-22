class Solution {
    public boolean isPalindrome(int x) {
        int pal=0;
        int o=x;
        if(x<0)
        {
            return false;
        }
        while(true)
        {
            if(x>0)
            {
                int a=x%10;
                pal=pal*10+a;
                x=x/10;
            }
            else
            {
                break;
            }
        }
        if(pal==o)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}