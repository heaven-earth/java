import java.util.Random;
import java.util.Scanner;

public class Test1214 {
    public static void main(String[] args) {
//          Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        double num2 = scanner.nextDouble();
//        String str = scanner.nextLine();
//        String str2 = scanner.next();

//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int num3 = scanner.nextInt();
//            System.out.println("输入：" + num3);
//            sum += num3;
//        }
//        System.out.println(sum);


        //Random[0,100)
        Random random = new Random();
        int toGuess = random.nextInt(100) + 1;
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("输入");
            int num = scanner1.nextInt();
            if (num < toGuess) {
                System.out.println("低了");
            }else if (num >toGuess){
                System.out.println("高了");
            }else {
                System.out.println("对了");
                break;
            }
            scanner1.close();
        }

        Random random1 = new Random();
        int nums = random1.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num1 = sc.nextInt();
            if (nums < num1) {
                System.out.println("低了");
            }else if (nums > num1){
                 System.out.println("高了");
             }else {
               System.out.println("对了");
               break;
            }
            sc.close();
        }


    }
}


