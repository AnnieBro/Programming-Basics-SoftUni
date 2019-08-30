import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0)
                sumOdd += num;

            else
                sumEven += num;
        }

        if (sumOdd == sumEven)
            System.out.printf("Yes%n" +
                    "Sum = %d", sumOdd);

        else
            System.out.printf("No%n" +
                    "Diff = %d", Math.abs(sumOdd - sumEven));
    }
}
