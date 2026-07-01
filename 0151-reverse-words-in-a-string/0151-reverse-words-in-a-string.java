class Solution {
    public String reverseWords(String s) {
        String []str=s.trim().split(" ");
        int f=str.length;
        String rev="";
        for(int i=f-1;i>=0;i--)
        {
            if(!str[i].isEmpty())
            {
                rev+=str[i];
            }
            if(i!=0 && !str[i].isEmpty())
            {
                rev+=" ";
            }
        }
        return rev;
        
    }
}