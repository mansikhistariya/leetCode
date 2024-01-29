class MyQueue {
     Stack<Integer> input;
     Stack<Integer> output;
  
    public MyQueue() {
         input=new Stack<>();
         output=new Stack<>();
        
    }
    
    public void push(int x) {
        input.push(x);
        
    }
    
    public int pop() {
        while(input.size()>1){
           output.push(input.pop());

        }
        int data=input.pop();
        while(!output.isEmpty()){
            input.push(output.pop());
        }
         return data;
        
    }
    
    public int peek() {
        while(input.size()>1){
            output.push(input.pop());
        }
        int data=input.peek();
        while(!output.isEmpty()){
            input.push(output.pop());
        }
        return data;
        
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
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