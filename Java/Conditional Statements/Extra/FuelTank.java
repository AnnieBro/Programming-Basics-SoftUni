import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());

        if(liters >= 25){
            switch(fuelType){
                case "Diesel":
                    System.out.printf("You have enough diesel.");
                    break;
                case "Gasoline":
                    System.out.printf("You have enough gasoline.");
                    break;
                case "Gas":
                    System.out.printf("You have enough gas.");
                    break;
                default:
                    System.out.printf("Invalid fuel!");
                    break;
            }
        }
        else{
            switch(fuelType){
                case "Diesel":
                    System.out.printf("Fill your tank with diesel!");
                    break;
                case "Gasoline":
                    System.out.printf("Fill your tank with gasoline!");
                    break;
                case "Gas":
                    System.out.printf("Fill your tank with gas!");
                    break;
                default:
                    System.out.printf("Infalid fuel!");
                    break;
            }
        }
    }
}
