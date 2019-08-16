import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double chamois = Double.parseDouble(scanner.nextLine());
        double horseMackerel = Double.parseDouble(scanner.nextLine());
        int mussels = Integer.parseInt(scanner.nextLine());

        double chamoisPrice = mackerelPrice * 1.6;
        double horseMackerelPrice = spratPrice * 1.8;
        double musselsPrice = 7.50;

        double total = chamoisPrice * chamois + horseMackerelPrice * horseMackerel + musselsPrice * mussels;
        System.out.printf("%.2f", total);
    }
}

