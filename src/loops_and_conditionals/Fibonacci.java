package loops_and_conditionals;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a limit: ");
        int limit = sc.nextInt();
        int[] arr = new int[limit + 2];

        arr[0] = 0;
        arr[1] = 1;
        int a = 1;
        int b = 0;
        int num;
        int i = 1;
        while(i<=limit){
            num = a;
            a = a + b;
            b = num;
            arr[i+1] = a;
            i++;
        }
        System.out.println("Enter which 'n' you want (0 to " + limit + "): ");
        int n = sc.nextInt();
        System.out.println("The " + n + "th fibonacci number is: " + arr[n]);
    }
}
