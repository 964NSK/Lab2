public class Car extends Transport {
    public Car (int capacity, String name) {
        super(capacity,name);
    }
    @Override
    public void moving() {
        System.out.printf(name + " is riding");
    }

}