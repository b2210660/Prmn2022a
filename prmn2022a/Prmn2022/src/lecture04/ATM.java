package lecture04;

import java.util.ArrayList;
import java.util.List;

public class ATM {
    private List<Account> accountList;

    public ATM(){
        this.accountList = new ArrayList<>();

    }

    public void registerAccount(String name, String number){
        Account account = new Account(name, number);
        accountList.add(account);
        System.out.println("名前：" + name + "　口座番号：" + number + "を登録しました");

    }

    public boolean existsAccount(String name, String number){
        for(Account account : accountList){
            if(account.getNumber().equals(number)){
                if(account.getName().equals(name)){
                    return true;

                }

            }

        }
        return false;

    }

    public void deposit(String number, long money){
        for(Account account : accountList){
            if(account.getNumber().equals(number)){
                account.setBalance(money + account.getBalance());
                System.out.println("口座番号：" + number + "　に" + money + "円入金しました");
                return;

            }

        }
        System.out.println("口座番号：" + number + " は存在しません");

    }

    public long withdraw(String number, long money){
        for(Account account : accountList){
            if(account.getNumber().equals(number)){
                if(money<=account.getBalance()) {
                    account.setBalance(account.getBalance() - money);
                    System.out.print("口座番号：" + number + "　から" + money + "円出金しました\n残高：");

                }else{
                    System.out.print("口座番号：" + number + "　から" + money + "円出金できません\n残高：");

                }
                return account.getBalance();

            }

        }
        System.out.println("口座番号：" + number + " は存在しません");
        return 0;

    }

}
