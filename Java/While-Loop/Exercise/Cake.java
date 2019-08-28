import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt((scanner.nextLine()));

        int total = length * width;
        String pieces = scanner.nextLine();

        while (!pieces.equals("STOP")) {
            int requestedPieces = Integer.parseInt(pieces);
            total -= requestedPieces;

            if (total < 0) {
                break;
            }

            pieces = scanner.nextLine();
        }

        if (total < 0)
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(total));

        else
            System.out.printf("%d pieces are left.", total);
    }
}
