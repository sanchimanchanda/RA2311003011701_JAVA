import java.util.Scanner;
public class Ageverification {

    public static void main(String[]args){
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter your Age:");
        int age = reader.nextInt();
        if(age>18){
            System.out.print("Eligible to vote");
         }
            else{
            System.out.print("You are not eligible to vote");
            }
       
    }
}