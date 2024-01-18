public class Objective8Lab3 {
    public static void main(String[] args) {
        int counter = 1;

        for (counter = 1; counter <= 20; counter++){
            String oddEven = "";;

            if(counter % 2 == 0){
                oddEven = "even";
            } else {oddEven = "odd";}
            System.out.printf("%d is %s %n", counter,oddEven);
        }

    }
}