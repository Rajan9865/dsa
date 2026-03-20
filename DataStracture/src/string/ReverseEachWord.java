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
        String[] words = input.toLowerCase().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            StringBuilder stringBuilder1 = new StringBuilder(word);
            stringBuilder.append(stringBuilder1.reverse()).append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
