import static java.util.stream.IntStream.rangeClosed;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] numbersOneToFive = IntStream.range(1, 6).toArray();

        System.out.println("1 + 2 + 3 + 4 + 5 = " + calculateSum(numbersOneToFive));

        int[] numbersOneToHundreds = IntStream.range(1, 101).toArray();

        System.out.println("1 + 2 + ... + 100 = " + calculateSum(rangeClosed(1, 100).toArray()));
    }

    public static int calculateSum(int... numbers) {
        System.out.println(numbers instanceof int[]);
        return IntStream.of(numbers).sum();
    }
}