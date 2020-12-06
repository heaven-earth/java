public class java {
    public static void main(String[] args) {
        String a = "hello ";
        String b = "world";
        System.out.println(a + b);

        String str = "result = ";
        int c = 10;
        int d = 20;
        String result = str + c + d;
        System.out.println(result);

        int a1 = 10;
        int b1 = 20;
        System.out.println("a =" + a1 + ",b = " + b1);

        //作用域
        {
            int x = 10;
            System.out.println(x);
        }
        {
            double x = 20.0;
            System.out.println(x);
        }

        //final
        final int x = 10;
        //常量不能再程序运行工程中修改

        //java强类型编程语言
        int q = 10;
        double e = 1.0;
        e = q;
        System.out.println(e);

        int s = 0;
        double f = 10.5;
        //alt+回车
        s = (int) f;
        System.out.println(s);

        //数值提升
        int z = 10;
        long m = 20;
        long v =z + m;
        System.out.println(v);

        byte a2 = 10;
        byte b2 = 20;
        byte c2 = (byte) (a2 + b2);//相加时ab都为int
        System.out.println(c2);

        //int转string
        int num3 = 2;
        String str1 = num3 + "";
        System.out.println("str1 = " + str1);
        String str2 = String.valueOf(num3);
        System.out.println("str2 = " + num3);

        //string转int
        String str3 = "100";
        int num = Integer.parseInt(str3);
        double num1 = Double.parseDouble(str3);
        long num2 = Long.parseLong(str3);


    }
}
