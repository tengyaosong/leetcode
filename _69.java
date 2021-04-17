// given a non-negative integer x, compute and return the square rood of x.
public class _69 {
    public static int mySqrt(int x) {
        long start = 0;
        long end = x;
        while (start + 1 < end) { // if the start point is on the left side of end point
            long mid = start + (end - start) / 2; // (start + end) / 2 also works. but integer overflow could happen if start and end are very large integers
            if (mid * mid == x) {
                return (int)mid;
            }else if (mid * mid < x) {
                start = mid; // if mid * mid < x, meaning the mid is not at the left part of mid.
            }else end = mid;
        }
        if (end * end == x) {
            return (int)end;
        }else return (int)start;
    }
    public static void main (String[] args) {
        int x = 16;
        System.out.println(mySqrt(x));;
    }
}
