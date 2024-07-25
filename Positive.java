import java.util.Scanner;

public class positive {
    public static void main (String[]args){
        Scanner reader= new Scanner(System.in);
        System.out.print("Enter any number");
        int a = reader.nextInt();
       if(a>0){
        System.out.print("The Number is positive");
       }
       else if(a<0){
        System.out.print("The Number is negetive");
       }
       else{
        System.out.print("The Number is Zero");
       }

    }
}