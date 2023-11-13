public class Fan {

    final int Slow =1;
    final int Medium =2;
    final int Fast =3;

    private int speed = Slow;

    private boolean isOn =false;

    private double radius=5;

    private String color= "blue";

    public Fan(){

    }
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.isOn = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSlow() {
        return Slow;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        this.isOn = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed + ", " +
                (isOn ? "Fan is on" : "Fan is off") +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
