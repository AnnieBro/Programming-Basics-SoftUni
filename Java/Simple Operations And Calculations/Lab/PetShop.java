import java.util.Scanner;

public class PetShop {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int other = Integer.parseInt(scanner.nextLine());

        double total = dog*2.5+other*4;

        System.out.printf("%.2f lv.", total);
    }
}