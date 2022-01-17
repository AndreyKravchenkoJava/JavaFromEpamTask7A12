package project;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.stream(numbers).forEach(n -> {
            for (int i = 0; i < numbers.length; i++) {
                if (i % 2 == 1) {
                    numbers[i] = 0;
                }
            }
            System.out.print(n);
        });
    }
}
