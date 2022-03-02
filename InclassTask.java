import java.util.*;
import java.util.Random;
public class InclassTask {
    public static boolean isOdd(int x) {
        return x % 2 == 1;
    }

    public static boolean isLuckyNumber(int x) {
        return x > 0 && x % 2 == 0;
    }

    public static int LargestNum(Integer[] array) {
        return Collections.max(Arrays.asList(array));
    }

    public static double averageOfRandomDoubleArray() {
        return new Random().doubles(0, 100).limit(100).average().getAsDouble();
    }

    public static int numberOfUnderAverage(Integer[] nums) {
        double average = Arrays.asList(nums).stream().mapToDouble(a -> a).average().getAsDouble();
        long count = Arrays.asList(nums).stream().filter(x -> x < average).count();
        return (int) count;
    }

    public static void main(String[] args) {
        var ans = averageOfRandomDoubleArray();
        System.out.println(ans);
    }
}
