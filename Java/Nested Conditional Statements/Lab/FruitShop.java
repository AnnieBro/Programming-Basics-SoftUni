import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double amount = Double.parseDouble(scanner.nextLine());

        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", amount * 2.50);
                        break;
                    case "apple":
                        System.out.printf("%.2f", amount * 1.20);
                        break;
                    case "orange":
                        System.out.printf("%.2f", amount * 0.85);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", amount * 1.45);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", amount * 2.70);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", amount * 5.50);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", amount * 3.85);
                        break;
                    default:
                        System.out.printf("error");
                        break;
                }
                break;
            case "saturday":
            case "sunday":
                switch (fruit) {
                    case "banana":
                        System.out.printf("%.2f", amount * 2.70);
                        break;
                    case "apple":
                        System.out.printf("%.2f", amount * 1.25);
                        break;
                    case "orange":
                        System.out.printf("%.2f", amount * 0.90);
                        break;
                    case "grapefruit":
                        System.out.printf("%.2f", amount * 1.60);
                        break;
                    case "kiwi":
                        System.out.printf("%.2f", amount * 3.00);
                        break;
                    case "pineapple":
                        System.out.printf("%.2f", amount * 5.60);
                        break;
                    case "grapes":
                        System.out.printf("%.2f", amount * 4.20);
                        break;
                    default:
                        System.out.printf("error");
                        break;
                }
                break;
            default:
                System.out.printf("error");
                break;
        }
    }
}
