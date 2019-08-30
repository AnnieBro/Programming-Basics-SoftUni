import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double X = Double.parseDouble(scanner.nextLine());
        int P = Integer.parseInt(scanner.nextLine());

        double money = 0;
        int toys = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                toys ++;

            else {
                money += ((i + 1) / 2 * 10.0);
                money --;
            }
        }

        money += (toys * P);

        if (money >= X)
            System.out.printf("Yes! %.2f", money - X);

        else
            System.out.printf("No! %.2f", X - money);
    }
}
