package loops_and_conditionals;

import java.util.Scanner;

public class Counting_occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 10 digit number: ");
        long n = sc.nextLong();
        System.out.print("Enter a number to check its occurrence in your entered number: ");
        int check = sc.nextInt();
        int count = 0;
        while(n != 0){
            if(n%10 == check){
                count++;
            }
            n = n/10;
        }
        if(count == 0){
            System.out.println("There were no occurrences of " + check + " in the given number" );
        }
        else{
            System.out.println(check + " occurred " + count + " times in the given number");
        }
    }
}
