package string;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 3/20/2026
 */
public class ReverseEachWord {
    public static void main(String[] args) {
        String input = "I Love java";
//        String result = reverseEachWord(input);
        String result1 = reverseEachWord1(input);
        System.out.println("Reversed each String: " + result1);
        String[] words = input.toLowerCase().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            StringBuilder stringBuilder1 = new StringBuilder(word);
            stringBuilder.append(stringBuilder1.reverse()).append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }

    private static String reverseEachWord1(String input) {
        String[] words = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                stringBuilder.append(word.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
