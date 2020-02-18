import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // make a check on input


        try {
            int num = Integer.parseInt(args[0]);
            for (int i = 1; i <= 10; i++) {
                int result = i * num;
                System.out.println(num + " x " + i + " = " + result);

            } 
        } catch (NumberFormatException e){
            System.out.println("input need to be an integer between 1 and 10");
        }
    }


}
