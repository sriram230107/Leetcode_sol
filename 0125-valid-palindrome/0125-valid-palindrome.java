class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        int sl=s.length();
        for(int i=0;i<sl;i++)
        {
            if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122) || (s.charAt(i)>=48 && s.charAt(i)<=57)){
                char ch=s.charAt(i);
                arr.add(Character.toLowerCase(ch));
            }
        }
        int n =arr.size();
        for(int i =0;i<n/2;i++)
        {
            if(!(arr.get(i).equals(arr.get(n-1-i))))
            {
                return false;
            }
        }
        return true;
        
    }
}