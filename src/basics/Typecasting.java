package basics;

import java.util.Scanner;

public class Typecasting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // float num = sc.nextFloat();
        //System.out.println(num);


        // typecasting

        int number = (int) (68.89f);
       // System.out.println(number);


        // automatic type promotion in operations
        int a = 257;
        byte b = (byte)(a);  // 257 % 256 = 1
       // System.out.println(b);

        byte c = 40;
        byte d = 50;
        byte e = 100;
        int f = (c * d) / e;

        //System.out.println(f);


//        byte g = 50;
//        g = g * 2;

        int num = 'a';
        System.out.println(num);
    }
}

