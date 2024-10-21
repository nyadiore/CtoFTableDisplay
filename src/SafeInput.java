import java.util.Scanner;

public class SafeInput {
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            while (!pipe.hasNextInt()) {
                System.out.print("Invalid input. " + prompt + " [" + low + " - " + high + "]: ");
                pipe.next(); // clear invalid input
            }
            retInt = pipe.nextInt();
            pipe.nextLine(); // clear newline
        } while (retInt < low || retInt > high);

        return retInt;
    }
}
