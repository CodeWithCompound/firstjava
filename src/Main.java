import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {  // <--- loop starts here

            System.out.println("What is your first number?");
            double x = checker(sc);

            System.out.println("What is your second number?");
            double y = checker(sc);

            double result = add(x, y);
            double result2 = median(x, y);

            System.out.println("Result: " + result);
            System.out.println("Median: " + result2);

            System.out.println("Do another one? (y/n)");
            String ans = sc.next();

            if (!(ans.equalsIgnoreCase("y") || ans.equalsIgnoreCase("yes"))) {
                System.out.println("bye!");
                break;
            }

        }

        sc.close();
    }


    // This method RETURNS a double now
    public static double checker(Scanner sc) {
        while (true) {
            if (sc.hasNextDouble()) {
                double x = sc.nextDouble();
                System.out.println("valid number: " + x);
                return x; // give the value back to main
            } else {
                System.out.println("invalid input, try again:");
                sc.next(); // discard the bad token
            }
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double median(double a, double b) {
        return (a + b) / 2.0;
    }
}
