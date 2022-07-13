
public class Main {
    public static void main(String[] args) {


        Car car = new Car(2,"Car");
        car.moving();
        System.out.println();
        car.displayCapacity();

        Airplane airplane = new Airplane(200,"Airplane");
        airplane.moving();
        System.out.println();
        airplane.displayCapacity();

        Ship ship = new Ship(1500,"Ship");
        ship.moving();
        System.out.println();
        ship.displayCapacity();

    }

}
