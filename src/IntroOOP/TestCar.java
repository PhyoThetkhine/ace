package IntroOOP;

public class TestCar {
    public static void main (String [] args){
        Car car = new Car();
        car.wheels=4;
        car.color="BLack";
        car.door = 4;
        car.engine = 2.5;
        car.license = "MON";
        car.mirror = 5;

        Car.Drive();
        Car.Stop();
    }
}
