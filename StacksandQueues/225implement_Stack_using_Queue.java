class MyStack {
    Queue<Integer> front;
    Queue<Integer> back;
    
    public MyStack() {
        this.front = new  LinkedList<>();
        this.back = new LinkedList<>();
    }
    
    public void push(int x) {
        
        this.front.add(x);
            
    }
    
    public int pop() {
         if(this.empty())
            return 0;
        
         while(this.front.size() != 1){
             this.back.add(this.front.remove());
         }
        int poped = this.front.remove();
        while(!this.back.isEmpty()){
             this.front.add(this.back.remove());
         }
        return poped;
    }
    
    public int top() {
         if(this.empty())
            return 0;
        
         while(this.front.size() != 1){
             this.back.add(this.front.remove());
         }
        int peeked = this.front.peek();
        this.back.add(this.front.remove());
        while(!this.back.isEmpty()){
             this.front.add(this.back.remove());
         }
        return peeked;
    }
    
    public boolean empty() {
        return this.front.isEmpty();
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
