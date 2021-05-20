// scratch of Q. I will just keep it.
public class P {
    public static String addNumber (int n, boolean reverse) {
        String curString = "7 what 12 what 15";
        int temp = -1;
        StringBuilder sb = new StringBuilder();
        StringBuilder reversed = new StringBuilder();
        char[] chars = curString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                if (temp == -1) temp = chars[i] - '0';
                else temp = temp * 10 + (chars[i] - '0');
            }else {
                if (temp != -1) {
                    temp +=n;
                    if (!reverse) {
                        sb.append(temp);
                    }else {
                        String a = Integer.toString(temp);
                        reversed.append(a).reverse();
                        sb.append(reversed.toString());
                    }
                    temp = -1;
                }sb.append(chars[i]);
            }
        }
        if (temp != -1) {
            temp += n;
            if (!reverse) {
                sb.append(temp);
            }else {
                String b = Integer.toString(temp);
                reversed.append(b).reverse();
                sb.append(reversed.toString());
            }
        }
        return sb.toString();
    }
    public static void main (String[] args) {
        int n = 3;
        System.out.println(addNumber(n, true));
    }
}
