class MyStack {
	/**
	디큐 : 양쪽으로 데이터를 넣고 빼기 쉽다, 큐와 사용법이 비슷
	1. 데이터 넣기
	 > queue.add(val);
	2. 메소드
	 > queue.peekLast();  마지막으로 큐에쌓인 원소 삭제, 삭제된 원소 리턴(queue.removeLast() 와 동일)
	 > queue.peekFirst(); 최초 큐에쌓인 추가된 원소 삭제, 삭제된 원소 리턴(queue.removeFirst() 와 동일)
	 > queue.peekLast();  마지막으로 큐에쌓인 원소 확인
	 > queue.peekFirst(); 최초 큐에쌓인 추가된 원소 확인
    */
    Deque<Integer> que;
    
    public MyStack() {
        this.que = new ArrayDeque<>();
    }
    
    public void push(int x) {
        this.que.add(x);
    }
    
    public int pop() {
        return this.que.pollLast();
    }
    
    public int top() {
        return this.que.peekLast();
    }
    
    public boolean empty() {
        if(this.que.size() > 0){
            return false;
        }else{
            return true;
        } 
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */