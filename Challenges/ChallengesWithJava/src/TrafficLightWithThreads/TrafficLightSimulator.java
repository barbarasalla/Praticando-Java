package TrafficLightWithThreads;

public class TrafficLightSimulator {
    public static void main(String[] args)  {
        ThreadTrafficLight threadTrafficLight = new ThreadTrafficLight();

        for(int i =0; i<10; i++){
            System.out.println(threadTrafficLight.getColor());
            threadTrafficLight.waitToChangeColor();
        }
        threadTrafficLight.stopTrafficLigth();
    }
}
