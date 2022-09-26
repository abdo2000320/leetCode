class MyQueue {
    Stack<Integer> front ;
    Stack<Integer> back;
    
    public MyQueue() {
        this.front = new Stack<Integer>();
        this.back = new Stack<Integer>();
    }
    
    public void push(int x) {
        this.back.push(x);
    }
    
    public int pop() {
       if(this.empty())
           return 0; 
           
       while(!this.back.empty()){
            this.front.push(this.back.pop());
        }
        int poped = this.front.pop();
       while(!this.front.empty()){
            this.back.push(this.front.pop());
        }
        return poped;
    }
    
    public int peek() {
       if(this.empty())
           return 0; 
        
        while(!this.back.empty()){
            this.front.push(this.back.pop());
        }
        int peeked = this.front.peek();
        while(!this.front.empty()){
            this.back.push(this.front.pop());
        }
        return peeked;
    }
    
    public boolean empty() {
        return this.back.empty();
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
