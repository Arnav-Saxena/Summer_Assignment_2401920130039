import java.util.*;
class DecodeString {
    public String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> strStack = new ArrayDeque<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // build the repeat count
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                // Push current count and string, reset them
                countStack.push(k);
                strStack.push(curr);
                k = 0;
                curr = new StringBuilder();
            } else if (c == ']') {
                // Pop and build the repeated string
                StringBuilder decoded = strStack.pop();
                int repeat = countStack.pop();
                for (int i = 0; i < repeat; i++) {
                    decoded.append(curr);
                }
                curr = decoded;
            } else {
                // Normal character, append to current
                curr.append(c);
            }
        }
        return curr.toString();
    }
}