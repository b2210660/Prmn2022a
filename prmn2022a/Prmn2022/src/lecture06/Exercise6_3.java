package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        int Max = 5;

        for(int i=0 ; i<Max ; i++){
            nums.add(random.nextInt(6));
        }
        System.out.println("さいころを" + Max + "つ振りました。\n何番目のさいころの値を確認しますか？");
        try {
            int index = input.nextInt();
            System.out.println("ランダムな数値：" + nums.get(index));
        } catch (InputMismatchException e){
            System.out.println("整数以外の値が入力されました。\nプログラムを終了します。");
        } catch (IndexOutOfBoundsException e){
            System.out.println("エラー：ArrayListの範囲外のindexが入力されました");
        }

    }

}
