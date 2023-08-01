import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = reader.nextInt();


        for (int i = 2; i < number; i++) {
            int remainder = number % i;
            if (remainder == 0) {
                System.out.println("Sayı Asal Değildir");}
            else{
                System.out.println("Sayı Asaldır");

            }
            break;
        }


    }
}