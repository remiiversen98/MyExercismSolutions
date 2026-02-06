class NeedForSpeed {
    int speed;
    int batteryDrain;
    int distanceDriven = 0;
    int batteryHealth = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryHealth - batteryDrain < 0;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!(batteryHealth <= 0)) {
            if (!(batteryHealth - batteryDrain < 0)) {
                distanceDriven += speed;
                batteryHealth -= batteryDrain;
            }
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        if (car.batteryDrained()) return false;
        double batteryNeeded = ((double) distance / car.speed) * car.batteryDrain;
        if (car.batteryHealth - batteryNeeded < 0) return false;
        return true;
    }
}
