package playground.interviewBase;

/**
 * @author lenovo
 * @version 1.0
 * Dsa
 * @since 9/29/2026
 */
public class CountUppercaseLowercaseUsingJava8 {
    static void main() {
        String str = "programming";
        countUpperCaseAndLowercase(str);
        countUpperCaseAndLowercaseUsingJava8(str);
    }

    private static void countUpperCaseAndLowercaseUsingJava8(String str) {
        long uppercase = str.chars().filter(ch -> ch >= 'A' && ch <= 'Z').count();
        long lowercase = str.chars().filter(ch -> ch >= 'a' && ch <= 'z').count();
        System.out.println(uppercase + " " + lowercase);
    }

    private static void countUpperCaseAndLowercase(String str) {
        long upppercase = str.chars().filter(Character::isUpperCase).count();
        long lowercase = str.chars().filter(Character::isLowerCase).count();
        System.out.println(upppercase + " " + lowercase);
    }
}
