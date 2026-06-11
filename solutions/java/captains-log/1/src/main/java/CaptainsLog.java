import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        int listLength = PLANET_CLASSES.length;
        int randomInt = random.nextInt(listLength);
        return PLANET_CLASSES[randomInt];
    }

    String randomShipRegistryNumber() {
        int randomInt = 1000 + random.nextInt(9000);
        return "NCC-" + randomInt;
    }

    double randomStardate() {
        double randomDouble = 41000.0 + random.nextDouble(1000.0);
        return randomDouble;
    }
}
