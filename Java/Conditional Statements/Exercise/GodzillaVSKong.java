import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double outfits = statists * outfitPrice;
        if(statists > 150)
            outfits *= (1 - 0.1);

        if(budget < decor + outfits)
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", decor + outfits - budget);
        else
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budget - (decor + outfits));
    }
}
