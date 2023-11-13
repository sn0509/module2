public class Taxi {
    private String name;
    public Taxi(){
    }
    public Taxi (String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setName(){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + '\'' +
                '}';
    }

    public static class TaxiThread {
    }
}
