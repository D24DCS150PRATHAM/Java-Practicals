interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class p22 {
    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        int result = calculator.divisor_sum(6);
        System.out.println("Divisor sum of 6: " + result);

        result = calculator.divisor_sum(10);
        System.out.println("Divisor sum of 10: " + result);
    }
}