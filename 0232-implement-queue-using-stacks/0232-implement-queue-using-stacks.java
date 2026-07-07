class MyQueue {
    Deque<Integer> ar;

    public MyQueue() {
         ar=new ArrayDeque<>();
    }
    
    public void push(int x) {
        ar.addFirst(x);
        
    }
    
    public int pop() {
        return ar.removeLast();
        
    }
    
    public int peek() {
        return ar.peekLast();
        
    }
    
    public boolean empty() {

        return ar.isEmpty();
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