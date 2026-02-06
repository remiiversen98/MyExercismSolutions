class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        int count = birdsPerDay[birdsPerDay.length -1];
        count++;
        birdsPerDay[birdsPerDay.length -1] = count;
    }

    public boolean hasDayWithoutBirds() {
        for (int b : birdsPerDay) {
            if (b == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int i = 0; i < numberOfDays; i++) {
            if (i < birdsPerDay.length) {
                count += birdsPerDay[i];
            }
        }
        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int b : birdsPerDay) if (b >= 5) busyDays++;
        return busyDays;
    }
}
