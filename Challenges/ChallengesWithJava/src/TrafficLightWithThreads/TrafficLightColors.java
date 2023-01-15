package TrafficLightWithThreads;

public enum TrafficLightColors {
    GREEN(3500), YELLOW(1000), RED(3000);

    private int waitingTime;

    TrafficLightColors(int waitingTime){
        this.waitingTime = waitingTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }
}
