public class Airplane extends Transport{
    public Airplane (int capacity, String name) {
        super(capacity,name);
    }
    @Override
    public void moving(){
        System.out.printf(name + " is flying");
    }
}
