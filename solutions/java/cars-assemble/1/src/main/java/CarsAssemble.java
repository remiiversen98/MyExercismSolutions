public class CarsAssemble {


    public double productionRatePerHour(int speed) {
        if (speed <= 4) return speed * 221;
        if (speed <=8) return (speed * 221) * 0.9;
        if (speed == 9) return (speed * 221) * 0.8;
        else return (speed * 221) * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        if (speed <= 4) return (speed * 221) / 60;
        if (speed <=8) return (int) (((speed * 221) * 0.9) / 60);
        if (speed == 9) return (int) (((speed * 221) * 0.8) / 60);
        else return (int) (((speed * 221) * 0.77) / 60);
    }
}
