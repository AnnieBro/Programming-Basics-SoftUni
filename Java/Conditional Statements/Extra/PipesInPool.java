import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = Integer.parseInt(scanner.nextLine());
        int P1 = Integer.parseInt(scanner.nextLine());
        int P2 = Integer.parseInt(scanner.nextLine());
        double H = Double.parseDouble(scanner.nextLine());

        double P1Fullness = P1 * H;
        double P2Fullness = P2 * H;
        double total = P1Fullness + P2Fullness;
        double P1Percentage = P1Fullness / total * 100;
        double P2Percentage = P2Fullness / total * 100;

        if(total > V)
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", H, total - V);
        else
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", total / V * 100, P1Percentage, P2Percentage);
    }
}
