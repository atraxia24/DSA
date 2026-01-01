package loops_and_conditionals;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // take a word input (e.g fruit) if input is mango king of fruits apple sweet red fruit
        Scanner sc = new Scanner(System.in);
        //String fruit = sc.next();

//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits");
//            case "orange" -> System.out.println("only fruit with same name as color");
//            case "banana" -> System.out.println("long fruit with no seeds");
//            case "apple" -> System.out.println("round red fruit");
//            default -> System.out.println("enter a valid fruit");
//        }

        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Sunday");
//            case 2 -> System.out.println("Monday");
//            case 3 -> System.out.println("Tuesday");
//            case 4 -> System.out.println("Wednesday");
//            case 5 -> System.out.println("Thursday");
//            case 6 -> System.out.println("Friday");
//            case 7 -> System.out.println("Saturday");
//            default -> System.out.println("Enter a valid number");
//        }


        if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
            System.out.println("Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Enter a valid number");
        }
    }
}
