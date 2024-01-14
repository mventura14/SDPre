
public class Objective3Lab2 {
    public static void main(String[] args) {
        double side1 = 10, side2 = 8, hypotenus;

        hypotenus = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));

        System.out.printf("The hypotenuse of a triangle with sides %f and %f is %.15f %n", side1,side2,hypotenus);
    }
}