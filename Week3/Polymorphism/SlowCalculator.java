import java.lang.Math;

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

    public void exponent(int x, int y) {
        System.out.println("I don't work");
    }
}