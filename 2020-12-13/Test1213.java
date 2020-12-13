public class Test1213 {
    public static void main(String[] args) {
//        int count = 0;
//        for ( int i = 1; i <= 100; i++){
//            if ( i <= 9 && i % 9 == 0) {
//                count++;
//            }
//            if( i > 9) {
//               if( i / 10 == 9){
//                   count++;
//               }
//               if (i % 10 == 9){
//                   count++;
//               }
//            }
//        }
//        System.out.println("9的个数共" +count + "个");
//
//
//      //闰年
//        for ( int year = 1000; year <= 2000; year++) {
//            if (year % 4 == 0) {
//                System.out.println(year );
//            } else if (year % 100 == 0 && year % 400 == 0) {
//                    System.out.print(year );
//            }
//       }


        //素数1-100
      printAllPrime(1,100);
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

