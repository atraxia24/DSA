package loops_and_conditionals;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a multi digit number: ");
        int n = sc.nextInt();
        int ans = 0;
        while( n != 0){
            int rem = n%10;
            n = n/10;
            ans = ans * 10 + rem;
        }
        System.out.println("Reverse of the given number is: " + ans);

    }
}
