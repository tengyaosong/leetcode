// add binary
// given two strings a and b, return their sum as a binary string.
// a = "11"; b = "1"
// return "100"
public class _67 {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder(); // the result needs a string, use stringbuilder
        int i = a.length() - 1; // start from the last char of the give string
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry; // update sum with carry for the next iteration
            if (i >= 0) sum += a.charAt(i) - '0'; // the last char/digit of the given string
            if (j >= 0) sum += b.charAt(j) - '0';
            sb.append(sum % 2); // only two products of sum % 2, either 0 or 1 which are binary.
            carry = sum / 2; // sum = 0, sum / 2 = 0, no need to carry; sum = 1, sum / 2 = 0, no need to carry; sum = 2, sum / 2 = 1, carry 1.
            i--;
            j--;
        }
        if (carry != 0) {
            sb.append(carry);
        }return sb.reverse().toString();
    }
    public static void main (String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
}
