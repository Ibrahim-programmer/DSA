class MyStack {
    ArrayList<Integer> al;
    int front = 0;
    int rear = 0;
    public MyStack() {
        al = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        al.add(x);
        rear++;
    }
    
    public int pop() {
        int index = rear - 1;
        // int val = al.get(index);
        for(; front < index ; front++){
            al.add(al.get(front));
            rear++;
        }
        int val = al.get(front++);
        return val;
    }
    
    public int top() {
        // return al.get(rear - 1);
        int index = rear - 1;
        for(; front < index ; front++){
            al.add(al.get(front));
            rear++;
        }
        int val = al.get(front);
        al.add(val);
        rear++;
        front++;
        return val;
    }
    
    public boolean empty() {
        return rear == front;
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