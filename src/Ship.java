public class Ship extends Transport {
    public Ship (int capacity, String name) {
        super(capacity,name);
    }

    @Override
    public void moving() {
        System.out.printf(name + " is sailing");
    }
}

