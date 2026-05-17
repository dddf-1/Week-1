public class Bicycle extends Vehicle {
    private boolean isElectric; // 전동 여부

    public Bicycle(String name, int speed, boolean isElectric) {
        super(name, speed);
        this.isElectric = isElectric;
    }

    @Override
    public String getInfo() {
        return "[자전거] " + getName() + " | 최고속도: " + getSpeed() + "km/h | " + (isElectric ? "전동" : "일반");
    }
}

