// integer to roman
// 3576 --> MMMDLXXVI
public class _12 {
    public static String intToRoman(int num) {
        String[] thousands = new String[] {" ", "M", "MM", "MMM"};
        String[] hundreds = new String[] {" ", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCC", "CM"};
        String[] tens = new String[] {" ", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = new String[] {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num / 1000] +
                hundreds[(num / 100) % 10] +
                tens[(num / 10) % 10] +
                units[(num / 1) % 10];
    }
    public static void main(String[] args) {
        int num = 3576;
        System.out.println(intToRoman(num));
    }
}
