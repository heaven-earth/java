public class Test121501 {
    public static void main(String[] args) {
            int i = 0;
            int j = 0;
            for (i = 1; i < 10; i++)
            {
                for (j = 1; j <=i; j++)
                {
                    System.out.printf("%d*%d=%d\t", j, i, i*j);
                    if (i == j)
                        System.out.printf("\n");
                }
            }

    }
}
