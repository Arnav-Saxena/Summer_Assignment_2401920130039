class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        // Split sentence into words
        String[] words = s.split(" ");
        // Reverse each word
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }
        // Join back into a sentence
        return String.join(" ", words);
    }
}