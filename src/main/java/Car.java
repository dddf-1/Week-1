public class Car extends Vehicle {
    private String fuel; // 연료 종류: 휘발유, 전기, 수소

    public Car(String name, int speed, String fuel) {
        super(name, speed);
        this.fuel = fuel;
    }

    @Override
    public String getInfo() {
        return "[자동차] " + getName() + " | 최고속도: " + getSpeed() + "km/h | 연료: " + fuel;
    }
}

