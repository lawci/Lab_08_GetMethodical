import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int dayMax;
        switch (month) {
            case 2:
                dayMax = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayMax = 30;
                break;
            default:
                dayMax = 31;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter your birth day", 1, dayMax);
        int hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.printf("You were born on %d/%d/%d at %02d:%02d%n", year, month, day, hour, minute);
    }
}