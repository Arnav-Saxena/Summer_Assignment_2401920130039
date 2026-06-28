import java.util.*;
class EvalRPN {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stk = new ArrayDeque<>();
        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                int b = stk.pop(), a = stk.pop();
                int res = 0;
                switch (t) {
                    case "+": res = a + b; break;
                    case "-": res = a - b; break;
                    case "*": res = a * b; break;
                    case "/": res = a / b; break;
                }
                stk.push(res);
            } else {
                stk.push(Integer.parseInt(t));
            }
        }
        return stk.pop();
    }
}