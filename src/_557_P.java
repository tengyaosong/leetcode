////Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
////Input: "Let's take LeetCode contest"
////Output: "s'teL ekat edoCteeL tsetnoc"
public class _557_P {
    public static String reverseWords(String s) {
        String[] sa = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sa.length; i++) {
            sa[i] = new StringBuilder(sa[i]).reverse().toString() + " ";
            res.append(sa[i]);
        }
        return String.valueOf(res).trim();
    }

    public static void main(String[] args) {
        String s = "Let's play games";
        System.out.println(reverseWords(s));
    }
}
