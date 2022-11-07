package lecture01;

import java.util.Scanner;

public class lecture03 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("input age");
        int age = input.nextInt();

        if(age<20 && 0<=age){
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        }else if(20<=age){
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }else{
            System.out.println("error");
        }
    }
}
