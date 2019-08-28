import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfTransactions = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int transactionsMade = 0;

        while (transactionsMade < countOfTransactions){
            double amount = Double.parseDouble((scanner.nextLine()));
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", amount);
            sum += amount;
            transactionsMade++;
        }

        System.out.printf("Total: %.2f", sum);
    }
}
