package lecture02;

class GasStation {
    void refuel(Car car){
        car.fuel = car.fuel + 20;
        System.out.println("給油してfuelが２０増えました");

    }
}
