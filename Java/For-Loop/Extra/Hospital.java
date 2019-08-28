import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = Integer.parseInt(scanner.nextLine());
        int doctors = 7;

        int treatedPatients = 0;
        int untreatedPatients = 0;

        for (int i = 1; i <= time; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (untreatedPatients > treatedPatients)
                    doctors++;
            }

            if (patients > doctors) {
                treatedPatients += doctors;
                untreatedPatients += patients - doctors;
            }

            else
                treatedPatients += patients;
        }

        System.out.printf("Treated patients: %d.%n" +
                "Untreated patients: %d.", treatedPatients, untreatedPatients);
    }
}
