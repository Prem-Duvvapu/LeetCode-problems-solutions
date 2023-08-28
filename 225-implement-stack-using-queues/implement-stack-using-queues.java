class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while (q1.size()>1)
            q2.add(q1.poll());

        int val=q1.poll();

        while (!q2.isEmpty())
            q1.add(q2.poll());

        return val;
    }
    
    public int top() {
        while (q1.size()>1)
            q2.add(q1.poll());

        int val=q1.poll();

        while (!q2.isEmpty())
            q1.add(q2.poll());
        q1.add(val);

        return val;
    }
    
    public boolean empty() {
        return q1.isEmpty();
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