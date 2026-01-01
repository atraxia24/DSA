package loops_and_conditionals;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter an operator from : '+', '-', '*', '/', '%' ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter number 1: ");
                int a = sc.nextInt();
                System.out.println("Enter number 2: ");
                int b = sc.nextInt();
                if(op == '+'){
                    ans = a + b;
                }
                if( op == '-'){
                    ans = a - b;
                }
                if( op == '*'){
                    ans = a * b;
                }
                if( op == '/'){
                    if( b != 0){
                        ans = a/b;
                    }
                    else{
                        System.out.println("Non divisible. Invalid number");
                    }
                }
                if( op == '%'){
                     if( b != 0){
                        ans = a%b;
                    }
                    else {
                        System.out.println("Invalid numbers");
                    }
                }
            }
            else if ( op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid operators");
            }
            System.out.println(ans);
            System.out.println("Type x or X to exit.");
        }
    }
}