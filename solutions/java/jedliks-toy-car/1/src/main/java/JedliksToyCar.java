public class JedliksToyCar {
    private int metersTraveled = 0;
    private int batteryHealth = 100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + metersTraveled + " meters";
    }

    public String batteryDisplay() {
        if (batteryHealth == 0) return "Battery empty";
        return "Battery at " + batteryHealth + "%";
    }

    public void drive() {
        if (batteryHealth != 0) {
            metersTraveled+=20;
            batteryHealth-=1;
        }

    }
}
