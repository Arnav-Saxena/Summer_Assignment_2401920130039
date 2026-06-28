import java.util.*;
class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> next = new HashMap<>();
        Deque<Integer> stk = new ArrayDeque<>();
        for (int x : nums2) {
            while (!stk.isEmpty() && stk.peek() < x) {
                next.put(stk.pop(), x);
            }
            stk.push(x);
        }
        // remaining have no greater
        while (!stk.isEmpty()) {
            next.put(stk.pop(), -1);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = next.get(nums1[i]);
        }
        return res;
    }
}