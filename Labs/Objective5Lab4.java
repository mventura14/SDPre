import java.util.Scanner;

public class Objective5Lab4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter a number: ");
            int userNum = scan.nextInt();

            if (userNum % 2 == 0){
                System.out.println("The Number is even");
            } else {
                System.out.println("The Number is odd");
            }
        }
}