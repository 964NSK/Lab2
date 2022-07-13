
public class Main {

    public static void main(String[] args) {


        Car car = new Car(2,"Car");
        getInfo(car);


        Airplane airplane = new Airplane(200,"Airplane");
        getInfo(airplane);

        Ship ship = new Ship(1500,"Ship");
        getInfo(ship);

        }
    public static void getInfo(Transport p) {
        p.moving();
        System.out.println();
        p.displayCapacity();
    }

}
