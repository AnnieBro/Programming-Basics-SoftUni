import java.util.Scanner;

public class YardGreening {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double km = Double.parseDouble(scanner.nextLine());
        double price = km * 7.61;
        double discount = 0.18 * price;
        double finalPrice = price - discount;

        System.out.printf("The final price is: %.2f lv.", finalPrice);
        System.out.println();
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
