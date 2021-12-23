package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialTests {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        Scanner scanner = new Scanner(System.in);

        try {
            int n = scanner.nextInt();
            System.out.printf("%d! = %d\n", n, f.calculate(n));
        } catch (IllegalArgumentException iae) {
            System.out.println("Catch IAE");
            iae.printStackTrace();
        } catch (InputMismatchException ime) {
            System.out.println("Catch IME");
            ime.printStackTrace();
        } finally {
            System.out.println("Closing scanner");
            scanner.close();
        }
    }
}
