package basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.println("Your roll number is: " +roll);


        int millions = 234_000_000;

        System.out.println("this is how millions shows: " + millions);

        System.out.print("Enter your name and a message: ");
        String name = sc.nextLine();
        System.out.println(name);



        System.out.println("Enter your percentage without the % symbol: ");
        float marks = sc.nextFloat();
        System.out.println(marks + "%");
        sc.nextLine();
    }
}
