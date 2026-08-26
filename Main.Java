import java.util.Scanner;

class Main {

    public static int calculateSum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        int sum = calculateSum(firstNumber, secondNumber);

        System.out.println("Sum of the two numbers: " + sum);

    }

}
