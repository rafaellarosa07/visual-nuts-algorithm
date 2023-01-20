package algorithm.impl;

import algorithm.Calculate;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class CalculateService {

    public void calculate(int value) {

        IntConsumer consumer = number -> {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Visual Nuts");
            }else if (number % 5 == 0) {
                System.out.println("Nuts");
            } else if (number % 3 == 0) {
                System.out.println("Visual");
            }  else {
                System.out.println(number);
            }
        };


        IntStream.rangeClosed(1, value).forEachOrdered(consumer);

    }
}
