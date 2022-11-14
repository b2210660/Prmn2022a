package lecture03;

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        int num = input.nextInt();
        String[] str = new String[num+1];
        for(int i=0 ; i<num+1 ; i++){
            str[i] = input.nextLine();
        }
        for(String s : str){
            System.out.println(s);
        }
    }
}
