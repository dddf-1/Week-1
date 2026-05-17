public class Vehicle {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() { return name; }
    public int getSpeed() { return speed; }

    public String getInfo() {
        return name + " | 최고속도: " + speed + "km/h";
    }
}

