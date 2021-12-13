public class ECalculator {
    static double oneOverFactorial(long x) {
        if (x == 1)
            return 1;
        return 1.0 / x * oneOverFactorial(x - 1);
    }

    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 20000; i++) {
            sum += oneOverFactorial(i);
        }
        System.out.println(sum);
    }
}