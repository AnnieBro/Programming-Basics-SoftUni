import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine().toLowerCase();
        int people = Integer.parseInt(scanner.nextLine());

        double total = 0.00;
        double leftMoney = 0.00;

        if (people <= 4)
            leftMoney = budget * (1 - 0.75);
        else if (people <= 9)
            leftMoney = budget * (1 - 0.60);
        else if (people <= 24)
            leftMoney = budget * (1 - 0.50);
        else if (people <= 49)
            leftMoney = budget * (1 - 0.40);
        else
            leftMoney = budget * (1 - 0.25);

        switch (category){
            case "vip":
                total = people * 499.99;
                break;
            case "normal":
                total = people * 249.99;
                break;
        }

        if (leftMoney >= total)
            System.out.printf("Yes! You have %.2f leva left.", leftMoney - total);
        else
            System.out.printf("Not enough money! You need %.2f leva.", total - leftMoney);
    }
}
