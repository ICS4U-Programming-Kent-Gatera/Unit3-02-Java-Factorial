import java.util.*;
import java.io.*;

/**
 * Change me.
 *
 * @author Kent Gatera
 * @version 1.0
 * @since 2024-05-06
 */

// Factorial class
public final class Factorial {

    /** Private constructor to prevent instantiation. */
    private Factorial() {
        throw new UnsupportedOperationException("Cannot instantiate");
    }

    public static void main(final String[] args) {
        final File inputFile = new File("input.txt");
        final String outputFile = "output.txt";

        try {
            Scanner sc = new Scanner(inputFile);
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            while (sc.hasNextLine()) {
                try {
                    String inputLine = sc.nextLine();
                    try {
                        int number = Integer.parseInt(inputLine);
                        String factorial = String.valueOf(RecFactorial(number));
                        writer.write(factorial);
                    } catch (Exception e) {
                        writer.write("Must be an integer!");
                    } finally {
                        writer.newLine();
                    }
                } catch (Exception e) {
                    System.out.println("Invalid output path!");
                }
            }
            System.out.println("Done.");
            writer.close();
            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid input path!");
        }
    }

    /**
   * Recursive method that gets the factorial of a number.
   *
   * @param n passed.
   * @return n * RecFactorial(n-1).
   * @return 1.
   * @return n.
   */
    private static int RecFactorial(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return n;
        } else {
            return n * RecFactorial(n - 1);
        }
    }
}
