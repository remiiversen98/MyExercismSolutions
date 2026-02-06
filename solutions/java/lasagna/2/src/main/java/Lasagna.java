public class Lasagna {
    //defines the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }
    //defines the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int currentMinutes) {
        return expectedMinutesInOven() - currentMinutes;
    }
    //defines the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers) {
        return 2 * layers;
    }
    // defines the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return preparationTimeInMinutes(layers) + minutesInOven;
    }
}
