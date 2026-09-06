import java.util.Scanner;

public class WordReversalEncoder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String result = reverseEachWord(sentence);

        System.out.println(result);
    }

    static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {

            StringBuilder word = new StringBuilder(words[i]);

            word.reverse();

            result = result + word;

            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }
}
