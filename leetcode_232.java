class MyQueue {
    
    Stack<Integer> inStack;
    Stack<Integer> popStack;
    
    public MyQueue() {
        inStack = new Stack<>();
        popStack = new Stack<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
    public int pop() {
        while(!inStack.isEmpty()){
            popStack.push(inStack.pop());
        }
        int res = popStack.pop();
        while(!popStack.isEmpty()){
            inStack.push(popStack.pop());
        }
        return res;
    }
    
    public int peek() {
        while(!inStack.isEmpty()){
            popStack.push(inStack.pop());
        }
        int res = popStack.peek();
        while(!popStack.isEmpty()){
            inStack.push(popStack.pop());
        }
        return res;
    }
    
    public boolean empty() {
        if(!inStack.isEmpty() || !popStack.isEmpty()){
            return false;
        }
        return true;
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