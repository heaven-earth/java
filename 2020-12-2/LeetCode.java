public class LeetCode {
    public static void main(String[] args) {
        //double myPow = myPow(4, 5);
        System.out.println(myPow(4,5));
    }
    public static double myPow(double x, int n) {
        long N = n;
        double res = 1.0;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        //辅助变量取x值，如果幂次是单数，那就将这个数乘一次
        double cur = x;
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                res *= cur;
            }
            cur *= cur;
        }
        return res;
    }

}
