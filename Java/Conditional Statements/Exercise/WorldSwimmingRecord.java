import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double spm = Double.parseDouble(scanner.nextLine());

        double totalTime = (metres * spm) + (Math.floor(metres / 15) * 12.5);

        if(totalTime >= record)
            System.out.printf("No, he failed! He was %.2f seconds slower.", totalTime - record);
        else
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
    }
}
