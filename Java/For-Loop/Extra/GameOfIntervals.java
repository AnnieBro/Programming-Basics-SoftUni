import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turns = Integer.parseInt(scanner.nextLine());

        double totalPoints = 0.0;
        double number0 = 0.0;
        double number10 = 0.0;
        double number20 = 0.0;
        double number30 = 0.0;
        double number40 = 0.0;
        double invalid = 0.0;

        for (int i = 0; i < turns; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number <= 9) {
                totalPoints += (number * 0.2);
                number0++;
            }

            else if (number >= 10 && number <= 19) {
                totalPoints += (number * 0.3);
                number10++;
            }

            else if (number >= 20 && number <= 29) {
                totalPoints += (number * 0.4);
                number20++;
            }

            else if (number >= 30 && number <= 39) {
                totalPoints += 50;
                number30++;
            }

            else if (number >= 40 && number <= 50) {
                totalPoints += 100;
                number40++;
            }

            else {
                totalPoints /= 2;
                invalid++;
            }
        }

        number0 /= turns;
        number10 /= turns;
        number20 /= turns;
        number30 /= turns;
        number40 /= turns;
        invalid /= turns;

        System.out.printf("%.2f%n" +
                "From 0 to 9: %.2f%%%n" +
                "From 10 to 19: %.2f%%%n" +
                "From 20 to 29: %.2f%%%n" +
                "From 30 to 39: %.2f%%%n" +
                "From 40 to 50: %.2f%%%n" +
                "Invalid numbers: %.2f%%%n", totalPoints, number0 * 100, number10 * 100, number20 * 100,
                number30 * 100, number40 * 100, invalid * 100);
    }
}
