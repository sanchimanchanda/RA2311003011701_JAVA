import java.util.Scanner;

public class Gradingsystem {
    public static void main(String[]args){
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter Your Grade:");
      int score = reader.nextInt();
      
        int grade = score / 10;

        switch (grade) {
            case 10:
            System.out.println("A (Excellent)");
            break;
            case 9:
                System.out.println("A (Excellent)");
                break;
            case 8:
                System.out.println("B (Very Good)");
                break;
            case 7:
                System.out.println("C (Good)");
                break;
            case 6:
                System.out.println("D (Satisfactory)");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F (Fail)");
                break;
            default:
                System.out.println("Invalid score input. Please enter a score between 0 and 100.");
                break;
        }
      
    }
}