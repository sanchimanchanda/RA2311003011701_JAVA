import java.util.Scanner;

public class vendingMachine {
    public static void main(String[]args){
        Scanner reader = new Scanner (System.in);
        System.out.print("Press 1 for Juice and 2 for Soda : ");
        int a = reader.nextInt();
        if (a==1) {
            System.out.print("Dispensing Juice");

        }
        else if(a==2){
            System.out.print("Dispensing Soda");
        }
        else{
            System.out.print("Invalid input");
        }
    }
}