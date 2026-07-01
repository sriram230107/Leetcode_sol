class Solution {
    public String reverseWords(String s) {
        String []str=s.split(" ");
        int f=str.length;
        String rev="";
        for(int i=f-1;i>=1;i--)
        {
            if(!str[i].isEmpty())
            {
                rev+=str[i];
            }
            if(!str[i].isEmpty())
            {
                rev+=" ";
            }
        }
        rev+=str[0];
        return rev.trim();
        
    }
}