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

class SlowCalculator extends Calculator {
    int num3;

    public Integer multiply(int num1, int num2) {
        this.num3 = 0;
        for (int i = 0; i < num2; i++) {
            System.out.println(num3);
            num3 = num1 + num3;
        }
        return this.num3;
    }
}
