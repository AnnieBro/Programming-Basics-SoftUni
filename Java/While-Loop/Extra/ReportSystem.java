import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedSum = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int count = 1;
        int failCash = 0;
        int failCard = 0;
        double cash = 0;
        double card = 0;

        while (!input.equals("End")) {
            int money = Integer.parseInt(input);

            if (count % 2 == 0) {
                if (money >= 10) {
                    System.out.println("Product sold!");
                    card += money;
                }

                else {
                    System.out.println("Error in transaction!");
                    failCard++;
                }
            }

            else {
                if (money <= 100) {
                    System.out.println("Product sold!");
                    cash += money;
                }

                else {
                    System.out.println("Error in transaction!");
                    failCash++;
                }
            }

            if (cash + card >= expectedSum) {
                count /= 2;
                System.out.printf("Average CS: %.2f%n" +
                        "Average CC: %.2f", cash / (count - failCash), card / (count - failCard));
                break;
            }

            count++;
            input = scanner.nextLine();
        }

        if (cash + card < expectedSum)
            System.out.println("Failed to collect required money for charity.");
    }
}
