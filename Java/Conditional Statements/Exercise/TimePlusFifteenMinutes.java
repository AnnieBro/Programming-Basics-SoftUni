import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if(minutes<=44)
            System.out.printf("%d:%d", hours, minutes+15);
        else if(15-(60-minutes)<10){
            if(hours+1>=24)
                System.out.printf("%d:0%d", 0, 15-(60-minutes));
            else
                System.out.printf("%d:0%d", hours+1, 15-(60-minutes));
        }
        else if(15-(60-minutes)>=10){
            if(hours+1>=24)
                System.out.printf("%d:%d", 0, 15-(60-minutes));
            else
                System.out.printf("%d:%d", hours+1, 15-(60-minutes));
        }
    }
}
