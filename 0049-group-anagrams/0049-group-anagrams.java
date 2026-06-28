class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        
        HashMap<String,List<String>>map=new HashMap<>();
       // String[] sr=new String();
        for(String s:str)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            if(!map.containsKey(String.valueOf(ch)))
            {
                map.put(String.valueOf(ch),new ArrayList<>());
                map.get(String.valueOf(ch)).add(s);
            }
            else
            {
                map.get(String.valueOf(ch)).add(s);
            }
        }
        return new ArrayList(map.values());
    }
}