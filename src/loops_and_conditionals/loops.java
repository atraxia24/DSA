package loops_and_conditionals;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // IF-ELSE


//        System.out.println("Enter your salary: ");
//        int salary = sc.nextInt();
//        if(salary>10000){
//            System.out.println("added a bonus of 2000. Now salary is: " + (salary+2000));
//        }
//        else{
//            System.out.println("added a bonus of 1000. Now salary is: " + (salary + 1000));
//        }


        // FOR LOOP

//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            System.out.print(i + " ");
//            System.out.println("Hello world");
//
//        }


        // WHILE LOOP

//        int num = 1;
//        while(num<=10){
//            System.out.print(num + " ");
//            System.out.println("Hello World");
//            num++;
//        }


        // DO WHILE LOOP

        int num = 6;
        do {
            System.out.print(num + " ");
            System.out.println("hello world");
            num++;
        }
        while (num <= 5);

    }
}
