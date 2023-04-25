import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ConcatenateTwoStrings concTwoStr = new ConcatenateTwoStrings();
//        String firstWord = "Dame";
//        String secondWord = "Dame";
//        String result = concTwoStr.mergeTwoStrings(firstWord, secondWord);
//        System.out.println(result);

//        PalindromeCheck palindrome = new PalindromeCheck();
//        String word = "121121";
//        boolean result = palindrome.CheckForPalindrome(word);
//        System.out.println(result);

        CheckTheSum sumChecker = new CheckTheSum();
        String first = "acb";
        String second = "cba";
        String third = "cdb";
        boolean result = sumChecker.TwoStringsEqualsThird(first, second, third);
        System.out.println(result);
        }
    }
