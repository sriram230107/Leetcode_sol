class Solution {
    public int romanToInt(String s) {
        Stack<Character> stk=new Stack<>();
        int count=0;
        HashMap<Character,Integer> hm= new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        for(char ch:s.toCharArray())
        {
            if(!stk.isEmpty())
            {
                if(hm.get(ch)>hm.get(stk.peek()))
                {
                    count+=hm.get(ch)-(2*(hm.get(stk.peek())));
                    stk.pop();
                    stk.push(ch);
                }
                else if(hm.get(stk.peek())>=hm.get(ch))
                {
                    count=count+hm.get(ch);
                    stk.pop();
                    stk.push(ch);
                }
            }
            if(stk.isEmpty())
            {
                stk.push(ch);
                count+=hm.get(stk.peek());
            }
        }
        return count;
        
    }
}