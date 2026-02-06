public class Lasagna {
    private static final int EXPECTED_TIME_IN_OVEN = 40;
    private static final int MINUTES_PER_LAYER = 2;
    //defines the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return EXPECTED_TIME_IN_OVEN;
    }
    //defines the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int currentMinutes) {
        return expectedMinutesInOven() - currentMinutes;
    }
    //defines the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return MINUTES_PER_LAYER * layers;
    }
    // defines the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
