public class Test1229 {
    public static void main(String[] args){
        int[] arr = new int []{1, 2, 3};
        int[] arr1 = {1, 2, 3};
        System.out.println("length:" + arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        arr[2] = 100;
        System.out.println(arr[2]);


        int[] arr2 = {1, 2, 3};
        for (int x : arr) {
            System.out.println(x);

            printArray(arr);

            int num = 0;
            func(num);
            System.out.println("num = " + num);

            fun(arr);
            System.out.println("arr[0] = " + arr[0];


        }


    }

    private static void fun(int[] a) {
        a[0] = 10;
        System.out.println("a[0] = " + a[0]);
    }

    private static void func(int x) {
        x = 10;
        System.out.println("x = " + x);
    }

    private static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
