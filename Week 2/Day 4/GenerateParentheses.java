import java.util.*;
class GenerateParentheses {
    private List<String> result = new ArrayList<>();

    private boolean isValid(String curr) {
        int count = 0;

        for (char c : curr.toCharArray()) {
            if (c == '(') {
                count++;
            } else {
                count--;
            }

            if (count < 0) {
                return false;
            }
        }

        return count == 0;
    }

    private void solve(StringBuilder curr, int n) {
        if (curr.length() == 2 * n) {
            if (isValid(curr.toString())) {
                result.add(curr.toString());
            }
            return;
        }

        curr.append('(');
        solve(curr, n);
        curr.deleteCharAt(curr.length() - 1);

        curr.append(')');
        solve(curr, n);
        curr.deleteCharAt(curr.length() - 1);
    }

    public List<String> generateParenthesis(int n) {
        solve(new StringBuilder(), n);
        return result;
    }
}