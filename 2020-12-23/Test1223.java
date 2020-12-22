import java.io.IOException;
import java.util.Scanner;
public class Test1211 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        //1-100和
        int res = 0;
        int num = 1;
        for (; num <= 100; num++){
            res += num;
        }
        System.out.println(res);

        //5的阶乘
        int result = 1;
        for (int i = 1; i <= 5; i++){
            result *= i;
        }
        System.out.println(result);

        //阶乘和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int y = 1;
            for (int j = 1; j <= i; j++) {
                y *= j;
            }
            sum += y;
        }
        System.out.println(sum);

        //d0-while
        int m = 1;
        do {
            System.out.println(m);
        }while (m <= 10);


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(number);


    }
}
