
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length -1] = birdsPerDay[birdsPerDay.length -1] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirds = 0;
        int iterations = numberOfDays >= birdsPerDay.length ? birdsPerDay.length : numberOfDays;
        
        for (int i = 0; i < iterations; i++) {
            totalBirds += birdsPerDay[i];
        }
        return totalBirds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int bird : birdsPerDay) {
            if (bird >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
