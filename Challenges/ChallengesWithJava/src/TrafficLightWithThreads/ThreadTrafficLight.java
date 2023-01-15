package TrafficLightWithThreads;

public class ThreadTrafficLight implements Runnable {

    private TrafficLightColors color;
    private boolean stop;
    private  boolean colorChanged;

    public ThreadTrafficLight(){
        this.color= TrafficLightColors.RED;
        this.stop=false;
        this.colorChanged=false;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!stop){
            try {
                switch (this.color){
                case RED:
                    Thread.sleep(3000);
                    break;
                case YELLOW:
                    Thread.sleep(1000);
                    break;
                case GREEN:
                    Thread.sleep(3500);
                    break;
                default:
                    break;
                }
                this.changeColor();
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private synchronized void changeColor() {
        switch (this.color){
            case RED:
                this.color=TrafficLightColors.GREEN;
                break;
            case YELLOW:
                this.color=TrafficLightColors.RED;
                break;
            case GREEN:
                this.color=TrafficLightColors.YELLOW;
                break;
            default:
                break;
        }
        this.colorChanged=true;
        notify();
    }

    public synchronized void stopTrafficLigth(){
        this.stop=true;
    }

    public synchronized void waitToChangeColor(){
        while (!this.colorChanged){
            try {
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.colorChanged=false;
    }

    public TrafficLightColors getColor() {
        return color;
    }
}
