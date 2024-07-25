// import java.util.Scanner;
// public class TemperatureCheck {
//     public static void main(String[]args){
//         Scanner reader = new Scanner(System.in);
//         System.out.print("Enter the temperature in celcius");
//         int temp = reader.nextInt();
//         if(temp>30){
//             System.out.print("Hot")
//         }
//         else if(temp<=30 && temp>=20){
//             System.out.print("Its warm");
//         }
//         else(temp<=20 && temp>=10){
//             System.out.print("Its Cold");
//         }
//     }
// }
import java.util.Scanner;

public class TemperatureCheck {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        int temp = reader.nextInt();
        
        if (temp > 30) {
            System.out.println("Hot");
        } else if (temp >= 20) {
            System.out.println("It's warm");
        } else if (temp >= 10) {
            System.out.println("It's Cold");
        } else {
            System.out.println("It's very Cold");
        }
    }
}