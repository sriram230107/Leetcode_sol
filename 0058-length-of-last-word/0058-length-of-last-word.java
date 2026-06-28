class Solution {
    public int lengthOfLastWord(String s) {
        String []ch=s.split(" ");
        if((ch[ch.length-1])!="")
        {
            String h=ch[ch.length-1];
            return h.length();
        }
        else
        {
            String h=ch[ch.length-2];
            return h.length();
        }
    }
}