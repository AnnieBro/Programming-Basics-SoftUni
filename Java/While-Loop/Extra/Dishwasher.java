import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bottles = Integer.parseInt(scanner.nextLine());

        int ml = bottles * 750;
        String input = scanner.nextLine();
        int count = 1;
        int dishes = 0;
        int pots = 0;

        while (!input.equals("End")) {
            int washables = Integer.parseInt(input);

            if (count % 3 == 0) {
                ml = ml - washables * 15;
                pots += washables;
            }

            else {
                ml = ml - washables * 5;
                dishes += washables;
            }

            if (ml < 0)
                break;

            count++;
            input = scanner.nextLine();
        }

        if (ml < 0)
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(ml));

        else
            System.out.printf("Detergent was enough!%n" +
                    "%d dishes and %d pots were washed.%n" +
                    "Leftover detergent %d ml.", dishes, pots, ml);
    }
}
