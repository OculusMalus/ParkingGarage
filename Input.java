package u4.proj;

/**
 * Methods to accept input go in this class.

 */

import java.util.Scanner;

public class Input {


    public Input() {}

    /**
     * Validates integer input between 1 and 3

     */

    public static int checkInInput() {
        Scanner keyboard = new Scanner(System.in);
        int input;

        for (; ; ) {
            if (!keyboard.hasNextInt()) {
                System.out.print("Enter 1, 2, or 3...");
            } else {
                input = keyboard.nextInt();
                if (input >= 1 && input <= 3)
                    return input;
                System.out.print("Enter 1, 2, or 3...");
            }
            keyboard.nextLine(); // discard (rest of) line of input
        }
    }


    /**
     * Validates integer input of 1 or 2

     */
    public static int checkOutInput() {
        Scanner keyboard = new Scanner(System.in);
        int input;

        for (; ; ) {
            if (!keyboard.hasNextInt()) {
                System.out.print("Enter 1 or 2... ");
            } else {
                input = keyboard.nextInt();
                if (input >= 1 && input <= 2)
                    return input;
                System.out.print("Enter 1 or 2... ");
            }
            keyboard.nextLine();
        }
    }
}




















