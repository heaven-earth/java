public class Test1208 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a/b);
        System.out.println(11.5 % 2.0);

        int c = 10;
        c += 1;
        int d = c++;
        System.out.println(c);
        System.out.println(d);

        int e = 10;
        int f = ++a;
        System.out.println(f);
        int g = a++;
        System.out.println(g);

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        System.out.println(a < b && b < c);
        System.out.println(a < b || b < c);
        System.out.println(!(a < b));

//        System.out.println(10 > 20 && 10/0 ==0);
//        System.out.println(10 > 20 || 10/0 ==0);

        System.out.println(a & b);//按位与：两个为1则为1，否则为0
        System.out.println(a | b);//安慰或：两个为0则为0

        int r = 0x10;
        System.out.printf("%x\n",r << 2);
        System.out.printf("%x\n",r >> 1);
        int w = 0xffff0000;
        System.out.printf("%x\n", w >>> 1);

        //三目运算
        int max = a > b ? a : b;
        System.out.println(max);

    }
}
