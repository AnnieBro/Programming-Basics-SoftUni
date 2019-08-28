import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine()) * 100;

        double currentChange = 0;
        int count = 0;

        while (currentChange + 200 <= change) {
           currentChange += 200;
           count++;
        }

        while (currentChange + 100 <= change) {
            currentChange += 100;
            count++;
        }

        while (currentChange + 50 <= change) {
            currentChange += 50;
            count++;
        }

        while (currentChange + 20 <= change) {
            currentChange += 20;
            count++;
        }

        while (currentChange + 10 <= change) {
            currentChange += 10;
            count++;
        }

        while (currentChange + 5 <= change) {
            currentChange += 5;
            count++;
        }

        while (currentChange + 2 <= change) {
            currentChange += 2;
            count++;
        }

        while (currentChange + 1 <= change) {
            currentChange += 1;
            count++;
        }

        System.out.println(count);
    }
}
