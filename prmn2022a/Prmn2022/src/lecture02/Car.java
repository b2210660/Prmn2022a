package lecture02;

class Car {
    int fuel;

    Car(){
        fuel = 0;

    }

    void run(){
        if(fuel >= 1){
            fuel = fuel - 1;
            System.out.println("燃料を１消費して走りました。");

        }else{
            System.out.println("燃料不足です。走れませんでした。");

        }

    }

}
