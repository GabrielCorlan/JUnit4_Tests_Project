import java.util.Arrays;
import java.util.Collections;

public class Calculator {

    public static int findMax(int[] arr) {
        int max = 0;

        for (int j : arr) {
            if (max < j)
                max = j;
        }

        return max;
    }

    public String playFizzBuzz(int num) {
        return num % 15 == 0 ? "FizzBuzz" :
                num % 3 == 0 ? "Fizz" :
                        num % 5 == 0 ? "Buzz" :
                                String.valueOf(num);
    }
}
