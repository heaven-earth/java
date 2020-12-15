public class Test {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE-1);

        Long num = 10L;
        System.out.println(num);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        double nums = 1.0;
        System.out.println(nums);
        int a = 1;
        int b = 2;
        System.out.println(a / b);
        //能看到小数位，得到0.5
        double c = 1.0;
        double d = 2.0;
        System.out.println(c / d);
        double num1 = 1.1;
        System.out.println(num1 * num1);

        float num2 = 1.0f;
        System.out.println(num2);

        //char占两个字节
        char ch = '中';
        System.out.println(ch);

        byte value = 0;
        System.out.println(value);

        boolean value1 = true;
        System.out.println(value1);

        String name = "zhangsan";
        System.out.println(name);
        System.out.println("My name is \"张三\"");

        System.out.println(num);
        System.out.print(num);
        System.out.printf("%d",num);

    }
}
