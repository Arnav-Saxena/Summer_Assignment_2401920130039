import java.util.*;
class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] ans = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; --i) {
            while (!stk.isEmpty() && T[stk.peek()] <= T[i]) {
                stk.pop();
            }
            ans[i] = stk.isEmpty() ? 0 : stk.peek() - i;
            stk.push(i);
        }
        return ans;
    }
}