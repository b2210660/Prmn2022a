package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            double a = input.nextDouble();
            System.out.println(a);
        } catch (InputMismatchException e){
            System.out.println("エラー.");
        }



    }
}
