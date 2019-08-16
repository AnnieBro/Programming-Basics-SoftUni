import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double rakiya = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());

        double rakiyaPrice = whiskeyPrice * 0.5;
        double winePrice = rakiyaPrice * 0.6;
        double beerPrice = rakiyaPrice * 0.2;

        double total = rakiya * rakiyaPrice + wine * winePrice + beer * beerPrice + whiskey * whiskeyPrice;

        System.out.printf("%.2f", total);
    }
}
