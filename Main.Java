import java.util.Scanner;

class Main {

    // Method to calculate and return the sum of two integers
    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    // Method to calculate and return the average of two integers
    public static double calculateAverage(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2.0;
    }

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        int sum = calculateSum(firstNumber, secondNumber);
        double average = calculateAverage(firstNumber, secondNumber);

        // Display the calculated results
        System.out.println("Sum of the two numbers: " + sum);
        System.out.println("Average of the two numbers: " + average);

        input.close();
    }
}
