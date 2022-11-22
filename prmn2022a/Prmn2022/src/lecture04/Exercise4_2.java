package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        String name = "角野斗優";
        String number = "123456";

        if(atm.existsAccount(name, number)){
            System.out.println("名前：" + name + "　口座番号：" + number + "は存在します");
        }else{
            System.out.println("名前：" + name + "　口座番号：" + number + "は存在しません");
        }

        atm.registerAccount(name, number);

        if(atm.existsAccount(name, number)){
            System.out.println("名前：" + name + "　口座番号：" + number + "は存在します");
        }else{
            System.out.println("名前：" + name + "　口座番号：" + number + "は存在しません");
        }

        atm.deposit(number, 1000);
        System.out.println(atm.withdraw(number, 2000));
        System.out.println(atm.withdraw(number, 500));

    }

}
