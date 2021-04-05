//Given a positive integer num consisting only of digits 6 and 9.
//
//Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).

public class _1323 {
    public static int maximum69Number(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
                return Integer.valueOf(String.valueOf(chars));
            }
        }
        return Integer.valueOf(String.valueOf(chars));
    }

    public static void main(String[] args) {
        int num = 6;
        System.out.println(maximum69Number(num));
    }
}


