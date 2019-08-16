import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddybears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalPrice = puzzles * 2.60 + dolls * 3 + teddybears * 4.10 + minions * 8.20 + trucks * 2;
        if(puzzles + dolls + teddybears + minions + trucks >= 50)
            totalPrice *= (1 - 0.25);
        totalPrice*=(1 - 0.1);

        if(excPrice <= totalPrice)
            System.out.printf("Yes! %.2f lv left.", totalPrice - excPrice);
        else
            System.out.printf("Not enough money! %.2f lv needed.", excPrice - totalPrice);
    }
}
