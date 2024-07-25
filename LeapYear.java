import java.util.Scanner;
public class leapyear {
    public static void main (String[]args){
        Scanner reader = new Scanner(System.in);
         System.out.print("Enter any Year:");
         int a = reader.nextInt();
         if (a%4==0 && a%100 !=0) {
            System.out.print("This is a leap year");
         }
         else if(a%100==0 && a%400==0){
            System.out.print("This is a leap year");
         }
         else{
            System.out.print("This is not a leap year");
         }
    }
}