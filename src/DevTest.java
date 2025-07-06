import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Test getRegExString for birthdate ---
        String birthdate = SafeInput.getRegExString(scanner, "Enter your date of birth (YYYY-MM-DD)", "^\\d{4}-\\d{2}-\\d{2}$");
        System.out.println("Date entered: " + birthdate);

        // --- Test getYNConfirm ---
        boolean wantsToContinue = SafeInput.getYNConfirm(scanner, "Do you want to continue?");
        System.out.println("User wants to continue: " + wantsToContinue);

        // --- Test getRangedDouble ---
        double rangedDouble = SafeInput.getRangedDouble(scanner, "Enter a double between 5.5 and 15.5", 5.5, 15.5);
        System.out.println("Ranged double entered: " + rangedDouble);

        // --- Test getRangedInt ---
        int rangedInt = SafeInput.getRangedInt(scanner, "Enter an integer between 1 and 10", 1, 10);
        System.out.println("Ranged integer entered: " + rangedInt);

        // --- Test getDouble ---
        double anyDouble = SafeInput.getDouble(scanner, "Enter any number");
        System.out.println("Number entered: " + anyDouble);

        // --- Test getInt ---
        int anyInt = SafeInput.getInt(scanner, "Enter any integer");
        System.out.println("Integer entered: " + anyInt);
        // --- Test getNonZeroLenString ---
        String name = SafeInput.getNonZeroLenString(scanner, "Enter your name");
        System.out.println("Your name is " + name);



    }


}
