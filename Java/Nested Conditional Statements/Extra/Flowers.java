import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        char holiday = scanner.nextLine().charAt(0);

        double price = 0.00;
        double discount = 1;

        switch (season){
            case "spring":
                if(tulips > 7)
                    discount -= 0.05;
            case "summer":
                price = chrysanthemum * 2 + roses * 4.10 + tulips * 2.50;
                break;
            case "winter":
                if (roses >= 10)
                    discount -= 0.10;
            case "autumn":
                price = chrysanthemum * 3.75 + roses * 4.50 + tulips * 4.15;
                break;
        }

        if (holiday == 'Y')
            price *= 1.15;

        price *= discount;

        if (chrysanthemum + roses + tulips > 20)
            price *= 0.80;

        price += 2;

        System.out.printf("%.2f", price);
    }
}
