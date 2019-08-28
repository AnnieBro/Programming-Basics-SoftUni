import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double amount = Double.parseDouble(scanner.nextLine());

        if(town.equals("sofia")){
            switch(product){
                case "coffee":
                    System.out.println(amount * 0.50);
                    break;
                case "water":
                    System.out.println(amount * 0.80);
                    break;
                case "beer":
                    System.out.println(amount * 1.20);
                    break;
                case "sweets":
                    System.out.println(amount * 1.45);
                    break;
                case "peanuts":
                    System.out.println(amount * 1.60);
                    break;
            }
        }

        else if(town.equals("plovdiv")){
            switch(product){
                case "coffee":
                    System.out.println(amount * 0.40);
                    break;
                case "water":
                    System.out.println(amount * 0.70);
                    break;
                case "beer":
                    System.out.println(amount * 1.15);
                    break;
                case "sweets":
                    System.out.println(amount * 1.30);
                    break;
                case "peanuts":
                    System.out.println(amount * 1.50);
                    break;
            }
        }

        else if(town.equals("varna")){
            switch(product){
                case "coffee":
                    System.out.println(amount * 0.45);
                    break;
                case "water":
                    System.out.println(amount * 0.70);
                    break;
                case "beer":
                    System.out.println(amount * 1.10);
                    break;
                case "sweets":
                    System.out.println(amount * 1.35);
                    break;
                case "peanuts":
                    System.out.println(amount * 1.55);
                    break;
            }
        }
    }
}
