package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        int num = input.nextInt();

        ArrayList <String> str = new ArrayList <String> ();

        for (int i=0 ; i<num+1 ; i++) {
            str.add(input.nextLine());

        }
        for (String s : str) {
            System.out.println(s);

        }

    }

}
