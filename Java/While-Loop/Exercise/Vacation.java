import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());

        int days = 0;
        int daysInRow = 0;

        while (availableMoney < neededMoney && daysInRow < 5) {
            String action = scanner.nextLine().toLowerCase();
            double money = Double.parseDouble(scanner.nextLine());

            if (action.equals("spend")) {
                if (money >= availableMoney)
                    availableMoney = 0;

                else
                    availableMoney -= money;

                daysInRow++;
            }

            else if (action.equals("save")) {
                availableMoney += money;
                daysInRow = 0;
            }

            days++;
        }

        if (availableMoney >= neededMoney)
            System.out.printf("You saved the money for %d days.", days);

        else
            System.out.printf("You can't save the money.%n%d", days);
    }
}
