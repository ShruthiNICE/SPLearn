import java.util.Scanner;

interface StringFunction {
    String run(String str);
}

public class LambdaFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define lambda formats
        StringFunction exclaim = s -> s + "!";
        StringFunction ask = s -> s + "?";
        StringFunction upper = s -> s.toUpperCase();
        StringFunction reverse = s -> new StringBuilder(s).reverse().toString();
        StringFunction emoji = s -> s + " 😄";

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("\nChoose a formatting option:");
        System.out.println("1 - Add exclamation");
        System.out.println("2 - Add question mark");
        System.out.println("3 - Convert to uppercase");
        System.out.println("4 - Reverse string");
        System.out.println("5 - Add emoji");

        int choice = scanner.nextInt();
        scanner.close();

        StringFunction selectedFunction;

        switch (choice) {
            case 1: selectedFunction = exclaim; break;
            case 2: selectedFunction = ask; break;
            case 3: selectedFunction = upper; break;
            case 4: selectedFunction = reverse; break;
            case 5: selectedFunction = emoji; break;
            default:
                System.out.println("Invalid choice. Defaulting to exclaim.");
                selectedFunction = exclaim;
        }

        printFormatted(input, selectedFunction);
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println("\nFormatted Result: " + result);
    }
}
