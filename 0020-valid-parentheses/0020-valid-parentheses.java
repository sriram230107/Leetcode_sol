class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        int count =0;
        for(char ch:s.toCharArray())
        {
            if(ch=='('||ch=='{'||ch=='[')
            {
                stk.push(ch);
            }
            else if(!stk.isEmpty())
            {
                if(ch=='}')
                {
                    if(stk.peek()=='{')
                    {
                        stk.pop();
                    }
                    else
                    return false;
                    
                }
                else if(ch==']'){
                    if(stk.peek()=='[')
                    {
                        stk.pop();
                    }
                    else{
                        return false;
                    }

                }
                else if(ch==')')
                {
                    if(stk.peek()=='(')
                    {
                        stk.pop();
                    }
                    else{
                        return false;
                    }

                }
                else{
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        if(stk.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }

    }
}