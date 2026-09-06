import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        String result = encryptWord(word);

        System.out.println(result);
    }

    static String encryptWord(String word) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + 1);

                if (ch > 'z') {
                    ch = 'a';
                }
            }

            else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 1);

                if (ch > 'Z') {
                    ch = 'A';
                }
            }

            result.append(ch);
        }

        return result.toString();
    }
}
