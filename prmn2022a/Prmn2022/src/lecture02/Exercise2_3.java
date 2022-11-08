package lecture02;

public class Exercise2_3 {
    public static void main(String[] args){
        Tire[] tires = new Tire[4];

        for(int i=0 ; i<tires.length ; i++){
            tires[i] = new Tire(65);
        }

        Engine engine = new Engine(4000);

        GasStation2 gasStation = new GasStation2();
        Car2 car = new Car2(tires, engine);
        gasStation.refuel(car);
        car.startEngine();
        car.run();

    }
}
