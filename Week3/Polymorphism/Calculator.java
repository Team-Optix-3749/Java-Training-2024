public class Calculator {
    public Integer division(int num1, int num2) {
        return num1/num2;
    }

    public double division(double num1, double num2) {
        return num1/num2;
    }

    public Integer multiply(int num1, int num2) {
        return num1*num2;
    }

    public static void main(String[] args) {
        Calculator jim = new SlowCalculator();
        jim.multiply(10, 4);
        jim.division(4.5, 1.5);
        jim.division(4, 2);
    }
}