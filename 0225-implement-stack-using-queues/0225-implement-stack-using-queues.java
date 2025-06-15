class MyStack {
    private Queue<Integer> a;
    private Queue<Integer> b;

    public MyStack() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void push(int x) {
        a.add(x);
    }

    public int pop() {
        if (a.isEmpty()) return -1;

        // Move all but the last element to queue b
        while (a.size() > 1) {
            b.add(a.poll());
        }

        int top = a.poll();

    
        Queue<Integer> temp = a;
        a = b;
        b = temp;

        return top;
    }

    public int top() {
        if (a.isEmpty()) return -1;

        while (a.size() > 1) {
            b.add(a.poll());
        }

        int top = a.poll();
        b.add(top);         

        // Swap a and b
        Queue<Integer> temp = a;
        a = b;
        b = temp;

        return top;
    }

    public boolean empty() {
        return a.isEmpty();
    }
}
