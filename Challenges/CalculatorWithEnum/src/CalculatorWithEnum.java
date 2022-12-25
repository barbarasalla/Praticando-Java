import java.util.Scanner;

public class CalculatorWithEnum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first value:");
        double x = in.nextDouble();
        System.out.println("Enter the second value:");
        double y = in.nextDouble();

        for (MathOperations mathOperations: MathOperations.values()){
            System.out.println(mathOperations.executeOperation(x,y));
        }
    }

    public enum MathOperations {

        SUM("+"){
            @Override
            public double executeOperation(double x, double y) {
                return x + y;
            }
        }, SUBTRACTION("-") {
            @Override
            public double executeOperation(double x, double y) {
                return x - y;
            }
        }, MULTIPLICATION("*") {
            @Override
            public double executeOperation(double x, double y) {
                return x * y;
            }
        }, DIVISION("/") {
            @Override
            public double executeOperation(double x, double y) {
                return x / y;
            }
        };

        private String symbol;

        MathOperations(String symbol) {
            this.symbol = symbol;
        }

        public abstract double executeOperation (double x, double y);

        @Override
        public String toString() {
            return this.symbol;
        }

    }
}