// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
import java.util.Locale;
import java.util.Stack;

public class _20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }else {
                if (!stack.isEmpty() && isPairedParentheses (stack.peek(), ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        } return stack.isEmpty();
    }
    private static boolean isPairedParentheses (char left, char right) {
        return left == '(' && right == ')' || left == '[' && right == ']' || left == '{' && right == '}';
    }
    public static void main (String[] args) {
        String s = "{()}";
        System.out.println(isValid(s));
    }
}
