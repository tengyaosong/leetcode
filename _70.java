// you are climbing a staircase. It takes n steps to reach the top.
// each time you can either climb 1 or 2 steps. In how many distinct ways you can climb to the top?
public class _70 {
    public static int climbStairs(int n) {
        // recursion method
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        } return climbStairs(n-1) + climbStairs(n-2);

    }
    public static void main(String[] args) {
        int n = 45;
        System.out.println(climbStairs(n));
        }
}
