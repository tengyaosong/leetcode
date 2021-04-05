// change 6 to 9 and output the largest number
public class _1323_P {
    public static int maximum69Number(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '6') {
                chars[i] = '9';
            }
        }
        return Integer.valueOf(String.valueOf(chars));
    }

    public static void main(String[] args) {
        int num = 6998;
        System.out.println(maximum69Number(num));
    }

}
