package ok.stream.api2;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        String str = " -importkeystore true - srckeystore kafka.jks -destkeystore kafka.p12 -deststoretype PKCS12";

        Map<String, String> parameters = Arrays.stream(str.split("\s+-"))
            .filter(s -> !s.isEmpty())
            .collect(Collectors.toMap(s -> "-" + s.split("\s+")[0], s -> s.split("\s+")[1]));

        System.out.println(parameters);


        String res = parameters.entrySet().stream()
            .map(entry -> entry.getKey() + " " + entry.getValue())
            .collect(Collectors.joining(" "));

        System.out.println(res);


        System.out.println("\nТаблица умножения:");
        IntStream.range(2, 10).forEach(i -> {
            IntStream.range(2, 10).forEach(j -> System.out.println(i + " * " + j + " = " + i*j));
        });
    }
}
