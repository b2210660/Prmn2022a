package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        Fighter f1 = new Fighter(100, 20, "Fighter1");
        Fighter f2 = new Fighter(200, 50, "Fighter2");

        while(f1.isAlive()==true && f2.isAlive()==true){
            f1.attack(f2);
            f2.attack(f1);

        }

        if(f1.isAlive()==true){
            System.out.println(f2.getName() + "は倒れた。");

        }else{
            System.out.println(f1.getName() + "は倒れた。");

        }

    }

}
