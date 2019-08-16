import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double total = magnolias * 3.25 + hyacinths * 4 + roses * 3.50 + cacti * 8;
        double moneyLeft = total * (1 - 0.05);
        double difference = Math.abs(moneyLeft - presentPrice);

        if(moneyLeft >= presentPrice)
            System.out.printf("She is left with %.0f leva.", Math.floor(difference));
        else if(moneyLeft < presentPrice)
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(difference));
    }
}
