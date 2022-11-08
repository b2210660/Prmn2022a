package lecture02;

class Car2 {

    Tire[] tires;
    Engine engine;
    int fuel;

    Car2(Tire[] tires, Engine engine){
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;

    }

    void run(){
        if(fuel >= 1){
            fuel = fuel - 1;
            System.out.println("燃料を１消費して走りました。");

        }else{
            System.out.println("燃料不足です。走れませんでした。");

        }

    }

    void startEngine(){
        engine.start();

    }

}
