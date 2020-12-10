public class Test1210 {
    public static void main(String[] args) {
        //打印1-10
        int num = 1;
        while (num <= 10) {
            System.out.println(num);
            num++;
        }

        //打印1-100的累加
        int res = 0;
        int n = 1;
        while (n <= 100) {
            res += n;
            n++;
        }
        System.out.println(res);

        //5的阶乘
        int numb = 1;
        int result = 1;
        while (numb <= 5) {
            result *= numb;
            numb++;
        }
        System.out.println(result);

        //求阶乘和
        int num2 = 1;
        int sum = 0;
        //求和
        while (num2 <= 5) {
            //求阶乘
            int tmp = 1;
            int i = 1;
            while (i <= num2) {
                tmp *= i;
                i++;
            }
            sum += tmp;
            num2++;
        }
        System.out.println("sum = " + sum);

        int num3 = 1;
        while (num3 <= 10) {
            System.out.println(num3);
            num3++;
        }

        //break
        int i = 100;
        while (i <= 200) {
            if (i % 3 == 0) {
                System.out.println("第一个3的倍数是：" + i);
                break;
            }
            i++;
        }

        //continue
        int j = 100;
        while (j <= 200) {
            if (j % 3 != 0){
                j++;
                continue;
            }
            System.out.println("3的倍数是：" + j);
            j++;
        }


    }
}
