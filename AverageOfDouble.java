import java.util.Scanner;

public class AverageOfDouble {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first double value: ");
        if (!scan.hasNextDouble()) {
            System.out.println("Error: Input is not a double.");
            scan.close();
            return;
        }
        double num1 = scan.nextDouble();

        System.out.print("Enter second double value: ");
        if (!scan.hasNextDouble()) {
            System.out.println("Error: Input is not a double.");
            scan.close();
            return;
        }
        double num2 = scan.nextDouble();

        double average = (num1 + num2) / 2;
        System.out.println("Average is: " + average);

        scan.close();
    }
}
