public class Transport {
    int capacity;
    String name;
    public Transport (int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
    }

    public void moving() {
        System.out.println("Moving");
    }
    public void displayCapacity() {
        System.out.println("capacity: " + capacity);

    }
}


