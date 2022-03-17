package sort_evenodd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class mainclass {
    public static Integer[] evenAndOdd(Integer[] nums) {
        List<Integer> numsList = Arrays.asList(nums);
        Collections.sort(numsList, (a, b) -> {
            if (a % 2 == 0 && b % 2 != 0)
                return -1;
            else
                return 1;
        });
        Integer[] finalList = numsList.toArray(new Integer[0]);
        return finalList;
    }
    public static void main(String[] args) {
        var result = evenAndOdd(new Integer[] { 1, 2, 3, 4, 5, 6, 7 });
        for (var i : result) {
            System.out.println(i);
        }
    }
}
