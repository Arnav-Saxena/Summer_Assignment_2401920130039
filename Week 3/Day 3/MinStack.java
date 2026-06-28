import java.util.*;
class MinStack {
    private Deque<Integer> stack = new ArrayDeque<>();
    private Deque<Integer> minStack = new ArrayDeque<>();
    public MinStack() {
        minStack.push(Integer.MAX_VALUE);
    }
    public void push(int x) {
        stack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
}