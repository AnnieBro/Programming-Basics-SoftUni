import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double veggiePrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int veggies = Integer.parseInt(scanner.nextLine());
        int fruit = Integer.parseInt(scanner.nextLine());

        double total = (veggiePrice * veggies + fruitPrice * fruit) / 1.94;
        System.out.printf("%.2f",total);
    }
}