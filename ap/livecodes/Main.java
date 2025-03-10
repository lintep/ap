package ap.livecodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int x = 100;
        long y = 123;
        System.out.println(x);
        System.out.println("x="+x);
        System.out.println("y="+y);

        System.out.println("--------------");
        int k=10;
        long z=10;
        System.out.println(k);
        System.out.println(z);
        System.out.println(10);
        System.out.println(10l);

//        int a = 10l;
//        k=z;

        k= (int) z;
        z=k;
//        32  <- int
//        3.2  <- double
//        int myId=123;
        final int MY_ID=123;
        int my_id=123;
        final float P = 3.14f;
//        p = 3.2f;

        System.out.println(1/9);
        System.out.println(1/9.0);
        System.out.println(1/(float)9);

        int b=100;
        double r=4;
        int n = 4;
        double result = b * Math.pow(1 + r / 100, n);

        System.out.println(result);

        System.out.println((int)3.2+1);
        System.out.println((int)3.9+1);
        System.out.println((int)3.0+1);

        System.out.println(Math.round(3.9+0.5));
        System.out.println(Math.round(3.2+0.5));
        System.out.println(Math.round(3.0+0.5));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number of bottles: ");
        int bottles = scanner.nextInt();
        System.out.println("bottles: "+bottles);
    }
}
