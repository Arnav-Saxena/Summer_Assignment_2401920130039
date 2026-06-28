import java.util.*;
class LargestRectangle {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length, res = 0;
        Deque<Integer> stk = new ArrayDeque<>();
        int[] left = new int[n], right = new int[n];
        Arrays.fill(right, n);
        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && heights[stk.peek()] >= heights[i]) {
                right[stk.peek()] = i;
                stk.pop();
            }
            left[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(i);
        }
        for (int i = 0; i < n; i++) {
            res = Math.max(res, heights[i] * (right[i] - left[i] - 1));
        }
        return res;
    }
}