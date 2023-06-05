package ok.stream.api;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        float a = uInput.nextFloat();
        float b = uInput.nextFloat();
        float c = uInput.nextFloat();

        System.out.println(Process(a, b, c, (a1, a2, a3) -> a2*a2 - 4*a1*a3));
    }

    public static float Process(float a1, float a2, float a3, Discriminant<Float> function) {
        return function.apply(a1, a2, a3);
    }
}