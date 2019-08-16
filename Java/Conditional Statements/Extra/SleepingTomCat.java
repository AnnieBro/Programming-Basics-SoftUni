import java.util.Scanner;

public class SleepingTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int restDays = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - restDays;
        int playTime = restDays * 127 + workDays * 63;
        boolean sleepWell = 30000 - playTime >= 0;
        int hours = Math.abs(30000 - playTime) / 60;
        int minutes = Math.abs(30000 - playTime) % 60;

        if(sleepWell)
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play", hours, minutes);
        else
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", hours, minutes);
    }
}
