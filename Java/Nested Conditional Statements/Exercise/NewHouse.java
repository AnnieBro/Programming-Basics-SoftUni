import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0.00;

        switch (flower){
            case "Roses":
                if(amount > 80)
                    price = amount * 5.00 * (1 - 0.10);
                else
                    price = amount * 5.00;
                break;
            case "Dahlias":
                if(amount > 90)
                    price = amount * 3.80 * (1 - 0.15);
                else
                    price = amount * 3.80;
                break;
            case "Tulips":
                if(amount > 80)
                    price = amount * 2.80 * (1 - 0.15);
                else
                    price = amount * 2.80;
                break;
            case "Narcissus":
                if(amount < 120)
                    price = amount * 3.00 * (1 + 0.15);
                else
                    price = amount * 3.00;
                break;
            case "Gladiolus":
                if(amount < 80)
                    price = amount * 2.50 * (1 + 0.20);
                else
                    price = amount * 2.50;
                break;
        }

        if(budget >= price)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    amount, flower, budget - price);
        else
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
    }
}