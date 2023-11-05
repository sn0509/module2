public abstract class Vehicle {
    private String name;
    private String branch;
    private String color;

    public Vehicle(String name, String branch, String color) {
        this.name = name;
        this.branch = branch;
        this.color = color;
    }

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
