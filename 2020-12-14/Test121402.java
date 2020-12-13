public class Test121402 {
    public static void main(String[] args) {
        int res = 0;
        for (int num = 1; num <= 5; num++) {
            res += fac(num);
        }
        System.out.println(res);

        printAllPrime(1,100);
    }



    public static int fac (int num) {
        int res = 1;
        for (int i = 1; i<= num; i++) {
            res *= i;
        }
        return res;

    }


    public static void printAllPrime(int start, int end) {
        for (int i = start;i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }


    public static boolean isPrime(int num) {
        if (num == 1 || num == 0){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
