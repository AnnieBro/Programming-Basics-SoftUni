import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int totalSpace = width * length * height;
        int sum = 0;
        String box = scanner.nextLine();

        while (!box.equals("Done")){
            int number = Integer.parseInt(box);
            sum += number;
            if (sum > totalSpace){
                System.out.printf("No more free space! You need %d Cubic meters more.", sum - totalSpace);
                break;
            }
            box = scanner.nextLine();
        }

        if (sum <= totalSpace)
            System.out.printf("%d Cubic meters left.", totalSpace - sum);
    }
}
