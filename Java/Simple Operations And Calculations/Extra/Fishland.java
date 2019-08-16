import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double chamois = Double.parseDouble(scanner.nextLine());
        double mackerel = Double.parseDouble(scanner.nextLine());
        int mussels = Integer.parseInt(scanner.nextLine());

        double chamoisPrice = skumriqPrice * 1.6;
        double safridPrice = tzatzaPrice * 1.8;
        double musselsPrice = 7.50;

        double total = chamoisPrice * chamois + mackerelPrice * mackerel + musselsPrice * mussels;
        System.out.printf("%.2f", total);
    }
}
