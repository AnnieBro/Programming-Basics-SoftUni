import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inheritance = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        int age = 18;
        double neededMoney = 0.00;

        for (int i = 1800; i <= year; i++, age++) {
            if (i % 2 == 0)
                neededMoney += 12000;

            else
                neededMoney += (12000 + 50 * age);
        }

        if (inheritance >= neededMoney)
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritance - neededMoney);

        else
            System.out.printf("He will need %.2f dollars to survive.", neededMoney - inheritance);
    }
}
