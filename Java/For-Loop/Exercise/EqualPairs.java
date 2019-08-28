import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxDiff = 0;
        boolean different = false;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scanner.nextLine());
            int num2 = Integer.parseInt(scanner.nextLine());

            if (i == 0)
                sum = num1 + num2;

            if (Math.abs(sum - (num1 + num2)) > maxDiff)
                maxDiff = Math.abs(sum - (num1 + num2));

            if (sum != num1 + num2)
                different = true;

            sum = num1 + num2;
        }

        if (different == false)
            System.out.printf("Yes, value=%d", sum);

        else
            System.out.printf("No, maxdiff=%d", maxDiff);
    }
}
