import java.util.Scanner;

public class FuelTankTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        if(clubCard.equals("Yes")) {
            if(fuelType.equals("Diesel")) {
                if (liters > 25)
                    System.out.printf("%.2f lv.", (2.33 * liters - 0.12 * liters) * (1 - 0.10));
                else if (liters >= 20 && liters <= 25)
                    System.out.printf("%.2f lv.", (2.33 * liters - 0.12 * liters) * (1 - 0.08));
                else
                    System.out.printf("%.2f lv.", 2.33 * liters - 0.12 * liters);
            }
            else if (fuelType.equals("Gasoline")) {
                if (liters > 25)
                    System.out.printf("%.2f lv.", (2.22 * liters - 0.18 * liters) * (1 - 0.10));
                else if (liters >= 20 && liters <= 25)
                    System.out.printf("%.2f lv.", (2.22 * liters - 0.18 * liters) * (1 - 0.08));
                else
                    System.out.printf("%.2f lv.", 2.22 * liters - 0.18 * liters);
            }
            else if (fuelType.equals("Gas")) {
                if (liters > 25)
                    System.out.printf("%.2f lv.", (0.93 * liters - 0.08 * liters) * (1 - 0.10));
                else if (liters >= 20 && liters <= 25)
                    System.out.printf("%.2f lv.", (0.93 * liters - 0.08 * liters) * (1 - 0.08));
                else
                    System.out.printf("%.2f lv.", 0.93 * liters - 0.08 * liters);
            }
        }

        else if(clubCard.equals("No")) {
            if (fuelType.equals("Diesel")) {
                if (liters > 25)
                    System.out.printf("%.2f lv.", 2.33 * liters * (1 - 0.10));
                else if (liters >= 20 && liters <= 25)
                    System.out.printf("%.2f lv.", 2.33 * liters * (1 - 0.08));
                else
                    System.out.printf("%.2f lv.", 2.33 * liters);
            }
            else if (fuelType.equals("Gasoline")) {
                if (liters > 25)
                    System.out.printf("%.2f lv.", 2.22 * liters * (1 - 0.10));
                else if (liters >= 20 && liters <= 25)
                    System.out.printf("%.2f lv.", 2.22 * liters * (1 - 0.08));
                else
                    System.out.printf("%.2f lv.", 2.22 * liters);
            }
            else if (fuelType.equals("Gas")) {
                if (liters > 25)
                    System.out.printf("%.2f lv.", 0.93 * liters * (1 - 0.10));
                else if (liters >= 20 && liters <= 25)
                    System.out.printf("%.2f lv.", 0.93 * liters * (1 - 0.08));
                else
                    System.out.printf("%.2f lv.", 0.93 * liters);
            }
        }
    }
}