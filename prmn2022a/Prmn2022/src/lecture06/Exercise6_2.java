package lecture06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        for(int i=0 ; i<5 ; i++){
            nums.add(random.nextInt(6));
        }
        int index = input.nextInt();

        try {
            System.out.println("ランダムな数値：" + nums.get(index));
        } catch (IndexOutOfBoundsException e){
            System.out.println("エラー：ArrayListの範囲外のindexが入力されました");
        }

    }

}
