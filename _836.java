public class _836 {
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        for (int i = 0; i < rec1.length; i++) {
            for (int j = 0; j < rec2.length; j++) {
                if (rec2[0] >= rec1[0] && rec2[0] < rec1[2] && rec2[1] >= rec1[1] && rec2[1] < rec1[3]) {
                    return true;
                } else return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] rec1 = {0, 0, 1, 1};
        int[] rec2 = {1, 0, 2, 1};
        System.out.println(isRectangleOverlap(rec1, rec2));
    }
}

