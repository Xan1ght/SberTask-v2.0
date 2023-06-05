package ok.stream.api;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner uInput = new Scanner(System.in);
        String s1 = uInput.nextLine();
        String s2 = uInput.nextLine();

        System.out.println(Process(s1, s2, (a1, a2) -> {
            if (a1.length() > a2.length()) {
                return a1;
            } else {
                return a2;
            }
        }));
    }

    public static String Process(String s1, String s2, Str<String> function) {
        return function.apply(s1, s2);
    }
}
