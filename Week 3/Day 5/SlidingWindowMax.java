import java.util.*;
class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < nums.length; i++) {
            // Remove indices outside window
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }
            // Remove smaller values (they won't be max)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }
            dq.offer(i);
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peek()];
            }
        }
        return ans;
    }
}