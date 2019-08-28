import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double price = 0.00;
        boolean discount = fishermen % 2 == 0 && !season.equals("autumn");

        switch (season){
            case ("spring"):
                if(fishermen <= 6)
                    price = 3000 * (1 - 0.10);
                else if(fishermen >= 12)
                    price = 3000 * (1 - 0.25);
                else
                    price = 3000 * (1 - 0.15);
                break;
            case ("summer"):
                if(fishermen <= 6)
                    price = 4200 * (1 - 0.10);
                else if(fishermen >= 12)
                    price = 4200 * (1 - 0.25);
                else
                    price = 4200 * (1 - 0.15);
                break;
            case ("autumn"):
                if(fishermen <= 6)
                    price = 4200 * (1 - 0.10);
                else if(fishermen >= 12)
                    price = 4200 * (1 - 0.25);
                else
                    price = 4200 * (1 - 0.15);
                break;
            case ("winter"):
                if(fishermen <= 6)
                    price = 2600 * (1 - 0.10);
                else if(fishermen >= 12)
                    price = 2600 * (1 - 0.25);
                else
                    price = 2600 * (1 - 0.15);
                break;
        }

        if(discount)
            price *= (1 - 0.05);

        if(budget >= price)
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        else
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
    }
}