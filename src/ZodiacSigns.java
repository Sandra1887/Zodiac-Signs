import java.util.*;

public class ZodiacSigns {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.print("Which date were you born?");
        while (!input.hasNextInt()) {
            if (!input.hasNext())
                System.exit(1);
            input.nextLine();
            System.out.println("Wrong input! Try again?");
        }
        int day = input.nextInt();

        System.out.print("Which month were you born? (Number of the month)");
        while (!input.hasNextInt()) {
            if (!input.hasNext())
                System.exit(1);
            input.nextLine();
            System.out.println("Wrong input! Try again?");
        }
        int month = input.nextInt();
        Zodiac.printSign(day, month);
    }
}