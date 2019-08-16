import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumriqPrice = Double.parseDouble(scanner.nextLine());
        double tzatzaPrice = Double.parseDouble(scanner.nextLine());
        double palamud = Double.parseDouble(scanner.nextLine());
        double safrid = Double.parseDouble(scanner.nextLine());
        int mussels = Integer.parseInt(scanner.nextLine());

        double palamudPrice = skumriqPrice * 1.6;
        double safridPrice = tzatzaPrice * 1.8;
        double musselsPrice = 7.50;

        double total = palamudPrice * palamud + safridPrice * safrid + musselsPrice * mussels;
        System.out.printf("%.2f", total);
    }
}
