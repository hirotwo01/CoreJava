package Function;

public class WordCount {

    public int countWords(String str) {
        str = str.trim(); // remove extra spaces
        if (str.isEmpty()) {
            return 0;
        }
        int count = 1; // first word
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
}
