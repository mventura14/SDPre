import java.util.Scanner;

public class Objective4Lab2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;
        double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

        System.out.println("Please enter the first whole number you would like to add.");
        num1 = scan.nextInt();
        System.out.println("Please enter the second whole number you would like to add.");
        num2 = scan.nextInt();
        System.out.println("Please enter the third whole number you would like to add.");
        num3 = scan.nextInt();
        System.out.println(" Please enter the first decimal number you would like to add.");
        dub1 = scan.nextDouble();
        System.out.println("Please enter the second decimal number you would like to add.");
        dub2 = scan.nextDouble();
        System.out.println("Please enter the third decimal number you would like to add.");
        dub3 = scan.nextDouble();
        System.out.printf("The sum of %d + %d + %d = %d %n", num1, num2, num3, num1 + num2 + num3);
        System.out.printf("The sum of %f + %f + %f = %f %n", dub1, dub2, dub3, dub1 + dub2 + dub3);


    }
}