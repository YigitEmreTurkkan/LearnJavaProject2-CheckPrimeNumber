import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = reader.nextInt();


        for (int i = 2; i < number; i++) {
            int remainder = number % i;
            if (remainder == 0) {
                System.out.println("This number is not prime.");}
            else{
                System.out.println("This number is prime.");

            }
            break;
        }


    }
}