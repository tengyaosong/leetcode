// Determine whether an integer is a palindrome.
// An integer is a palindrome when it reads the same backward as forward.
public class _9 {
    public static boolean isPalindrome(int x) {
        int reversed = 0;
        int original = x; // need to create an variable to declare the original x
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        } return reversed == original; // you cannot compare reversed with x because x is changing all the time.
    }
    public static void main (String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
}
