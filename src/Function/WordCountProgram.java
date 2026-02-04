package Function;

import java.util.Scanner;

public class WordCountProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        WordCount wc = new WordCount();
        int total = wc.countWords(str);
        System.out.println("Total number of words: " + total);
    }
}
