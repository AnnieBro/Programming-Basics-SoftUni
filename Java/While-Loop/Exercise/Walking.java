import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 0;

        while (sum < 10000) {
            String steps = scanner.nextLine();

            if (steps.equals("Going home")) {
                steps = scanner.nextLine();
                number = Integer.parseInt(steps);
                sum += number;
                break;
            }

            else {
                number = Integer.parseInt(steps);
                sum += number;
            }
        }

        if (sum >= 10000)
            System.out.printf("Goal reached! Good job!");

        else
            System.out.printf("%d more steps to reach goal.", 10000 - sum);
    }
}
