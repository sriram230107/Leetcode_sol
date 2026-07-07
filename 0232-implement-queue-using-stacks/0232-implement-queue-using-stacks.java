class MyQueue {

   Stack<Integer> ip;
   Stack<Integer> op;
    public MyQueue() {
        ip=new Stack<>();
        op=new Stack<>();
    }
    
    public void push(int x) {
        ip.push(x);
    }
    
    public int pop() {
        value();
        return op.pop();
        
    }
    
    public int peek() {
        value();
        return op.peek();
        
    }
    
    public boolean empty() {
        value();
        return op.isEmpty();

    }
    public void value(){
        if(op.isEmpty())
        {
            while(!ip.isEmpty())
              op.push(ip.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */