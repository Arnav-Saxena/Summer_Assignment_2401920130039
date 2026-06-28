class StringCompression {
    public int compress(char[] chars) {
        int write = 0, n = chars.length;
        for (int read = 0; read < n; ) {
            char c = chars[read];
            int count = 0;
            while (read < n && chars[read] == c) {
                read++; count++;
            }
            // write the character
            chars[write++] = c;
            // write count if >1
            if (count > 1) {
                for (char d : Integer.toString(count).toCharArray()) {
                    chars[write++] = d;
                }
            }
        }
        return write;
    }
}