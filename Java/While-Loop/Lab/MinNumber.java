import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());

        int newNumber = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        int minNumber = newNumber;

        while (counter < amount){
            newNumber = Integer.parseInt(scanner.nextLine());
            if (minNumber > newNumber)
                minNumber = newNumber;
            counter++;
        }

        System.out.println(minNumber);
    }
}
