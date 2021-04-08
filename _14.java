// longest common prefix
// given string array [monday, money, monkey]
// return [mon] as the longest common prefix
public class _14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "no string is given";
        }

        String longestCommonPrefix = strs[0]; // set the first string and start comparing with others
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            String currentString = strs[i]; // string we are visiting and comparing with strs[0]
            while (j < longestCommonPrefix.length() && j < currentString.length() && longestCommonPrefix.charAt(j) == currentString.charAt(j)) {
                j++;
            }
            if (j == 0) {
                return "no common prefix at all";
            }
            longestCommonPrefix = longestCommonPrefix.substring(0, j);
        }return longestCommonPrefix;
    }
    public static void main (String[] args) {
        String[] strs = {};
        //String[] strs = {"ponday", "qonkey", "money"};
        //String[] strs = {"monday", "monkey", "money"}
        System.out.println(longestCommonPrefix(strs));
    }
}
