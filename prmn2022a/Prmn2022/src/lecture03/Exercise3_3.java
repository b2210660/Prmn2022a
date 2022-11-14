package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList <Integer> num = new ArrayList<>();

        System.out.println("１つ目の整数を入力してください：");
        num.add(Integer.parseInt(input.next()));
        System.out.println("２つ目の整数を入力してください：");
        num.add(Integer.parseInt(input.next()));

        System.out.println(num.get(0) + " + " + num.get(1) + " = " + (num.get(0)+num.get(1)));

    }

}
