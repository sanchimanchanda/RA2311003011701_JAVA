import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 1 for addition or 2 for subtraction.");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();
            int sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } else if (choice == 2) {
            System.out.println("Enter the first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter the second number:");
            int num2 = scanner.nextInt();
            int difference = num1 - num2;
            System.out.println("The difference is: " + difference);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        
        scanner.close();
    }
}