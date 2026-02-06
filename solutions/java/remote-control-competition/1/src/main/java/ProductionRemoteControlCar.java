class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int unitsTravelled = 0;
    private int victories = 0;
    public void drive() {
        unitsTravelled += 10;
    }

    public int getDistanceTravelled() {
        return unitsTravelled;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.victories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return Integer.compare(o.victories, this.victories);
    }
}
