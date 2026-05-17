public class Bus extends Vehicle {
    private int capacity; // 최대 탑승 인원

    public Bus(String name, int speed, int capacity) {
        super(name, speed);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return "[버스] " + getName() + " | 최고속도: " + getSpeed() + "km/h | 정원: " + capacity + "명";
    }
}

