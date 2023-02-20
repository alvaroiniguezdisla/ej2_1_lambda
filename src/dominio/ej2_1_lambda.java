package dominio;

import java.util.stream.Stream;

public class ej2_1_lambda {

    public static int suma(int n) {
        return Stream.iterate(0, i -> i + 1).limit(n+1).reduce(0, (a, b) -> a + b);
    }
}
