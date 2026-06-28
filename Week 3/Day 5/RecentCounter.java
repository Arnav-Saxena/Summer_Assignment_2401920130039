import java.util.*;
class RecentCounter {
    private Deque<Integer> q = new ArrayDeque<>();
    public int ping(int t) {
        q.addLast(t);
        while (q.getFirst() < t - 3000) {
            q.removeFirst();
        }
        return q.size();
    }
}