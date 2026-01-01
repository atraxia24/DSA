package loops_and_conditionals;

import java.util.Scanner;

public class Case_check {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().trim().charAt(0);

        int check = (int) (ch);

        if (check <= 90 && check >= 65) {
            System.out.println("Capital letter.");
        } else if (check >= 91 && check <= 122) {
            System.out.println("small letter");
        }
    }

}
