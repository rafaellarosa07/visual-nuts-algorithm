package algorithm;

import java.util.function.IntConsumer;

@FunctionalInterface
public interface Calculate {

    IntConsumer calculate(int value);
}
