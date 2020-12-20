public class Test1209 {
    public static void main(String[] args) {
        System.out.println("aaa");
        System.out.println("bbb");
        System.out.println("ccc");

        int num = 10;
        if(num < 20){
            System.out.println("hello");
        }else{
            System.out.println("world");
        }

        int score = 90;
        if (score >= 90){
            System.out.println("优秀");
        }else if (score >= 80){
            System.out.println("良好");
        }else if (score >= 70){
            System.out.println("中等");
        }else if (score >= 60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

        int num1 = 10;
        if (num1 % 2 == 0){
            System.out.println("偶数");
        }else if (num1 % 2 != 0){
            System.out.println("奇数");
        }

        if(num > 0){
            System.out.println("正数");
        }else if (num < 0){
            System.out.println("负数");
        } else {
            System.out.println("零");
        }

        //判断某一年是否是闰年
        int year = 2000;
        if (year % 100 == 0) {
            //判定世纪闰年
            if (year % 400 ==0) {
                System.out.println("是闰年");
            }else {
                System.out.println("不是闰年");
            }
        }else {
            //普通闰年
            if (year % 4 == 0) {
                System.out.println("是闰年");
            } else {
                System.out.println("不是闰年");
            }
        }


        int day = 1;
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入错误");
        }



    }
}
