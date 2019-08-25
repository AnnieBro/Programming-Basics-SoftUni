import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examMinutes = examHour * 60 + examMinute;
        int arrivalMinutes = arrivalHour * 60 + arrivalMinute;
        int difference = Math.abs(arrivalMinutes - examMinutes);
        int remainingHours = difference / 60;
        int remainingMinutes = difference % 60;

        boolean late = arrivalMinutes > examMinutes;
        boolean onTime = arrivalMinutes <= examMinutes && examMinutes - arrivalMinutes <= 30;
        boolean early = arrivalMinutes < examMinutes && examMinutes - arrivalMinutes > 30;

        if (late) {
            System.out.printf("Late%n");
            if (remainingHours == 0) {
                System.out.printf("%2d minutes after the start", remainingMinutes);
            } else {
                if (remainingMinutes < 10)
                    System.out.printf("%d:0%d hours after the start", remainingHours, remainingMinutes);
                else
                    System.out.printf("%d:%d hours after the start", remainingHours, remainingMinutes);
            }
        }

        else if  (early) {
            System.out.printf("Early%n");
            if (remainingHours == 0){
                System.out.printf("%d minutes before the start", remainingMinutes);
            }
            else {
                if (remainingMinutes < 10)
                    System.out.printf("%d:0%d hours before the start", remainingHours, remainingMinutes);
                else
                    System.out.printf("%d:%d hours before the start", remainingHours, remainingMinutes);
            }
        }

        else if (onTime) {
            System.out.printf("On time%n");
            if (difference > 0)
                System.out.printf("%d minutes before the start", difference);
        }
    }
}