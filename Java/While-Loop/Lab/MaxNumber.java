import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = Integer.parseInt(scanner.nextLine());

        int newNumber = Integer.parseInt(scanner.nextLine());
        int counter = 1;
        int maxNumber = newNumber;

        while (counter < amount){
            newNumber = Integer.parseInt(scanner.nextLine());
            if (maxNumber < newNumber)
                maxNumber = newNumber;
            counter++;
        }

        System.out.println(maxNumber);
    }
}
