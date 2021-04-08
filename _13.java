import java.util.HashMap;
import java.util.Map;
// roman number to integer
// MMMDLXXVI --> 3576
public class _13 {
    public static int romanToInteger(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int length = s.length();
        int result = romanValues.get(s.charAt(length - 1));

        for (int i = length - 2; i >= 0; i--) {
            if (romanValues.get(s.charAt(i)) >= romanValues.get(s.charAt(i + 1))) {
                result += romanValues.get(s.charAt(i));
            } else {
                result -= romanValues.get(s.charAt(i));
            }
        }return result;
    }
    public static void main(String[] args) {
        String s = "MMMDLXXVI";
        System.out.println(romanToInteger(s));
    }
}
