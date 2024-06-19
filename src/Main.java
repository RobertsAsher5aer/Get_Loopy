import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Part A:

        for (int i = 0; i <=30; i++) {
            System.out.println(i);
        }

        System.out.println(" ");

        for (int j = 30; j >= 0; j--) {
            System.out.println(j);
        }

        System.out.println(" ");

        for (int k = 0; k <= 18; k += 3) {
            System.out.println(k);
        }

        System.out.println(" ");

        for (int r = 10; r >= 0; r -= 2) {
            System.out.println(r);
        }

        System.out.println(" ");

        // Part B:

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" ");

        for (int j = 5; j >= 1; j--) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" ");

        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println(" ");

        // Part C: Die Roller

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String userInput;

        do {
            int sum = 0;
            int dieValue = 0;

            for (int i = 1; i <=3; i++) {
                dieValue = random.nextInt(6) + 1;
                sum += dieValue;

                System.out.printf("Die %d : %d%n", i, dieValue);
            }
            System.out.printf("Sum: %d%n", sum);

            System.out.print("Roll again? (y/n): ");
            userInput = scanner.nextLine();
        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("Thanks for rolling! ");
        scanner.close();


    }
}
