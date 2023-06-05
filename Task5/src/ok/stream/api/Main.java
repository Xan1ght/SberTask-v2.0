package ok.stream.api;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        int n = uInput.nextInt();

        System.out.println(Process(n, a -> a % 13 == 0));
    }

    public static Boolean Process(int n, Is<Integer> function) {
        return function.apply(n);
    }
}
