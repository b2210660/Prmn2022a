package lecture04;

public class Fighter {
    private int hitPoint;
    private int power;
    private String name;

    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;

    }

    public void attack(Fighter enemy){
        enemy.hitPoint = enemy.hitPoint - power;
        System.out.println(this.name + "は" + enemy.name + "に" + power + "ダメージを与えた。");
        System.out.println(enemy.name + "の残りhitPoint : " + enemy.hitPoint);

    }

    public boolean isAlive(){
        if(this.hitPoint <= 0){
            return false;

        }else{
            return true;

        }

    }

    public int getHitPoint(){
        return this.hitPoint;

    }

    public void setHitPoint(int hitPoint){
        if(hitPoint <= 0){
            System.out.println("error");

        }else{
            this.hitPoint = hitPoint;

        }

    }

    public String getName(){
        return this.name;

    }

}
