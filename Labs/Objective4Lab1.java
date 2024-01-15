import java.util.Scanner;

public class Objective4Lab1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String fname = "";
        String lname = "";
        String favoriteAnimal = "";
        String favoriteFood = "";
        String favoriteSong = "";

        System.out.println("What is your first name?");
        fname = scan.nextLine();
        System.out.println("What is your last name?");
        lname = scan.nextLine();
        System.out.println("What is your favorite animal");
        favoriteAnimal = scan.nextLine();
        System.out.println("What is your favorite food?");
        favoriteFood = scan.nextLine();
        System.out.println("What is your favorite song?");
        favoriteSong = scan.nextLine();
        System.out.printf("My name is %s %s. %n", fname, lname);
        System.out.printf("My Favorite animal is the %s. %n", favoriteAnimal);
        System.out.printf("My favorite food is %s. %n", favoriteFood);
        System.out.printf("My favorite song is %s. %n", favoriteSong);

    }
}