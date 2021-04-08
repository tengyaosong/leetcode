import javax.print.DocFlavor;
// reverse an integer
// 1234 --> 4321
public class _7 {
    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        } return reversed;
    }
    public static void main (String[] args) {
        int x = 110;
        System.out.println(reverse(x));
    }
}
